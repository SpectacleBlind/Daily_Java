/* 프로그래머스 Level 1 문제 풀이
   18. 수박수박수박수박수박수?
       길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
       
      - n은 길이 10,000이하인 자연수입니다.
       */

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i<=n ; i++){
        answer += (i%2==1) ? "수" : "박";
       }        
        return answer;
    }
}