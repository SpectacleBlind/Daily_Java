/* 프로그래머스 Level 1 문제 풀이
   *. 가운데 글자 가져오기
      단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
      단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.     
      - s는 길이가 1 이상, 100이하인 스트링입니다.
       */

class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length()%2 == 1){
            answer += s.charAt(s.length()/2);
        }
        else{
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}


//다른 사람의 풀이

class StringExercise{
    String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }