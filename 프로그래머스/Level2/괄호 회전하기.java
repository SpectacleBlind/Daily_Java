/* 프로그래머스 Level 2 문제 풀이
   *. 프린터

       */

import java.util.Stack;


class Solution {
    public int solution(String s) {
        Stack <Character> stack = new Stack <>();
        int answer = 0;
        String temp = s + s;
        int len = s.length();     
        boolean check = true;
        
        for (int i = 0; i < s.length(); i++){
            
            String find = temp.substring(i,i+len);
            out : 
            for(int j = 0; j < find.length(); j++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
                else {
                  if(stack.isEmpty()) {
                      check = false;
                      break out;
                  }
                  if(s.charAt(i) == ')' && stack.pop()!='(') {
                      check = false;
                      break out;
                  }
                    if(s.charAt(i) == ']' && stack.pop()!='[') {
                      check = false;
                      break out;
                  }
                    if(s.charAt(i) == '}' && stack.pop()!='{') {
                      check = false;
                      break out;
                  }
            }}
            if(check) answer++;
        }
        return answer;
    }
}


//개선 버전

import java.util.Stack;


class Solution {
    public int solution(String s) {
        Stack <Character> stack = new Stack <>();
        int answer = 0;
        String temp = s + s;
        int len = s.length();         
        for (int i = 0; i < s.length(); i++){
        String find = temp.substring(i,i+len);
            if (checkString(find)) answer++;
        }
        return answer;
    }

    boolean checkString(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            try{
                switch(s.charAt(i)){
                    case '[': 
                        stack.add('[');
                        break;
                    case ']':
                        if(stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    case '{': 
                        stack.add('{');
                        break;
                    case '}':
                        if(stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    case '(': 
                        stack.add('(');
                        break;
                    case ')':
                        if(stack.peek() != '(') return false;
                        stack.pop();
                        break;
                }
            } catch(Exception e){
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
