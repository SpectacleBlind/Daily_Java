/* 프로그래머스 Level 1 문제 풀이
   *. 숫자 문자열, 영단어
       */

class Solution {
    public int solution(String s) {
     int answer = 0;
     String[] word  = {"zero","one","two","three","four","five","six","seven","eight","nine"};      
     String [] num = {"0","1","2","3","4","5","6","7","8","9"};
     for(int i = 0; i < word.length; i++){
       s = s.replace(word[i],num[i]); // 단어 확인 후 num 치환
     }
     answer = Integer.parseInt(s);
     return answer;
    }
}