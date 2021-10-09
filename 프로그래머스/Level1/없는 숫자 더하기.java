/* 프로그래머스 Level 1 문제 풀이
   *. 없는 숫자 더하기
       */

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i : numbers){
            sum += numbers[i];
        }
        int answer = 45-sum;
        return answer;
    }
}