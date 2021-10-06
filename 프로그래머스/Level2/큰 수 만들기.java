/* 프로그래머스 Level 2 문제 풀이
   *. 큰 수 만들기

       */

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        int comp = 0;
        for (int i = 0; i<number.length()-k;i++){
            comp = 0;
            for(int j = index; j<= i+k ; j++){
                if(comp < number.charAt(j) - '0'){
                    comp =  number.charAt(j) - '0';
                    index = j+1;
                }
            }
            sb.append(comp);
        }
        return sb.toString();
        }
}

/*
 * 테스트 1 〉	통과 (0.06ms, 82.6MB)
테스트 2 〉	통과 (0.12ms, 74.2MB)
테스트 3 〉	통과 (0.06ms, 66.4MB)
테스트 4 〉	통과 (0.48ms, 84MB)
테스트 5 〉	통과 (0.98ms, 72.9MB)
테스트 6 〉	통과 (15.58ms, 83.1MB)
테스트 7 〉	통과 (27.91ms, 84MB)
테스트 8 〉	통과 (195.08ms, 83.3MB)
테스트 9 〉	통과 (17.56ms, 83.6MB)
테스트 10 〉	통과 (7167.06ms, 100MB)
테스트 11 〉	통과 (0.04ms, 79MB)
테스트 12 〉	통과 (0.03ms, 79.7MB)
 */

// 다른 사람의 풀이

import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}

/*
테스트 1 〉	통과 (0.23ms, 79.9MB)
테스트 2 〉	통과 (0.21ms, 73.4MB)
테스트 3 〉	통과 (0.47ms, 76.6MB)
테스트 4 〉	통과 (0.93ms, 76.6MB)
테스트 5 〉	통과 (1.05ms, 69.6MB)
테스트 6 〉	통과 (7.72ms, 78.5MB)
테스트 7 〉	통과 (10.71ms, 80.6MB)
테스트 8 〉	통과 (17.62ms, 88.9MB)
테스트 9 〉	통과 (31.38ms, 97.7MB)
테스트 10 〉	통과 (45.83ms, 101MB)
테스트 11 〉	통과 (0.23ms, 76.9MB)
테스트 12 〉	통과 (0.22ms, 75.7MB)
*/
