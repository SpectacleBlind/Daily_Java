/* 프로그래머스 Level 1 문제 풀이
   11.정수 제곱근 판별 
       n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
      - n은 1이상, 50000000000000 이하인 양의 정수입니다.
      */

import java.lang.Math; 
class Solution { 
    public long solution(long n) {
        long answer = 0; 
        double base = Math.sqrt(n); 
        if ( base % 1 > 0 ) {
            answer = -1; 
        } 
        else answer = (long) Math.pow(base+1, 2); return answer; 
    } 
}

class Solution {
    public long solution(long n) {
        long temp = (long)Math.sqrt(n);
        long answer = (temp*temp == n) ? (temp+1)*(temp+1) : -1;
        return answer;
    }
}
