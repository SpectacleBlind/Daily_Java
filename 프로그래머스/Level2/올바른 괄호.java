/* 프로그래머스 Level 2 문제 풀이
   *. 올바른 괄호

       */

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack <>();
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else {
                if(stack.isEmpty()) return answer;
                else if(stack.pop()!='(') return answer;
            }
        }
        if(stack.isEmpty()) answer = true;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.17ms, 76.2MB)
테스트 2 〉	통과 (0.11ms, 74.4MB)
테스트 3 〉	통과 (0.16ms, 77.8MB)
테스트 4 〉	통과 (0.19ms, 73.6MB)
테스트 5 〉	통과 (0.17ms, 77.5MB)
테스트 6 〉	통과 (0.12ms, 74.5MB)
테스트 7 〉	통과 (0.19ms, 75.3MB)
테스트 8 〉	통과 (0.20ms, 75.2MB)
테스트 9 〉	통과 (0.19ms, 73.9MB)
테스트 10 〉	통과 (0.19ms, 73.2MB)
테스트 11 〉	통과 (0.19ms, 75.1MB)
테스트 12 〉	통과 (0.32ms, 78MB)
테스트 13 〉	통과 (0.23ms, 75.3MB)
테스트 14 〉	통과 (0.21ms, 73.7MB)
테스트 15 〉	통과 (0.23ms, 67.4MB)
테스트 16 〉	통과 (0.23ms, 72.4MB)
테스트 17 〉	통과 (0.22ms, 76.3MB)
테스트 18 〉	통과 (0.22ms, 74.3MB)
효율성  테스트
테스트 1 〉	통과 (18.89ms, 52.8MB)
테스트 2 〉	통과 (20.51ms, 53.5MB)
 */

// 다른 사람의 풀이

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}

/*
 * 스텍을 안쓰고 해도 빠르게 결과가 나온다!
테스트 1 〉	통과 (0.02ms, 73.4MB)
테스트 2 〉	통과 (0.01ms, 73.8MB)
테스트 3 〉	통과 (0.01ms, 73.2MB)
테스트 4 〉	통과 (0.02ms, 76.1MB)
테스트 5 〉	통과 (0.02ms, 77.8MB)
테스트 6 〉	통과 (0.02ms, 71.4MB)
테스트 7 〉	통과 (0.01ms, 73.3MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.02ms, 71.2MB)
테스트 10 〉	통과 (0.02ms, 76.6MB)
테스트 11 〉	통과 (0.02ms, 67.2MB)
테스트 12 〉	통과 (0.02ms, 84.9MB)
테스트 13 〉	통과 (0.02ms, 76.9MB)
테스트 14 〉	통과 (0.03ms, 76.5MB)
테스트 15 〉	통과 (0.02ms, 74.2MB)
테스트 16 〉	통과 (0.03ms, 72.4MB)
테스트 17 〉	통과 (0.03ms, 73.4MB)
테스트 18 〉	통과 (0.03ms, 71.7MB)
효율성  테스트
테스트 1 〉	통과 (7.67ms, 53.2MB)
테스트 2 〉	통과 (6.24ms, 52.4MB)
*/
