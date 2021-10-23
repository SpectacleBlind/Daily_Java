/* 프로그래머스 Level 1 문제 풀이
   *. 자연수 뒤집어 배열로 만들기
       자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
      - n은 10,000,000,000이하인 자연수입니다.  
      */


class Solution {
    public int[] solution(long n) {
        String num = "" + n;  
        int[] answer = new int[num.length()];
        int count = 0; 
        
        while(n>0){
        answer[count] = (int)n%10;
        n /=10;
        count++;
}
        return answer;
    }
}