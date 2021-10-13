/* 프로그래머스 Level 2 문제 풀이
   *. 숫자의 표현
      자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
      n은 10,000 이하의 자연수 입니다.
      */

class Solution {
    public int solution(int n) {
        int answer = 0;

        int count = 0;
        for(int j = 1; j <= n ; j++){
          int sum = 0;
         for(int i = j; i <= n ; i++){
            sum += i;
            if(n - sum > 0) continue;
            if(n == sum) {
                answer++;
                break;
            }
            if(n - sum < 0) break;
         }
        }
        return answer;
    }
}
//다른사람의 풀이

class Solution {
    public int solution(int num) {
        int answer = 0;
          for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
//대단하다....