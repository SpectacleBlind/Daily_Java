/* 프로그래머스 Level 1 문제 풀이
   *. 두 정수 사이의 합
      두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
      - a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
      - a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
      - a와 b의 대소관계는 정해져있지 않습니다.
       */

class Solution {
    public long solution(int a, int b) {
        int sum = a+b;
        int count = (a < b) ? (b-a+1) : (a-b+1);
        long answer = ((long)sum*(long)count)/2;
        return answer;
    }
}
		
