/* 프로그래머스 Level 1 문제 풀이
   12.정수 내림차순으로 배치하기 
       함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
      - n은 1이상 8000000000 이하인 자연수입니다.
      */

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String number = String.valueOf(n);
        String ans = "";
        char [] num = new char[number.length()];
        for (int i = 0; i < number.length(); i++){
            num[i] += number.charAt(i);
        }
        Arrays.sort(num);
        for (int i = number.length()-1; i >= 0; i--) { 
            ans += num[i]; }

        long answer = Long.parseLong(ans);
        return answer;
    }
}