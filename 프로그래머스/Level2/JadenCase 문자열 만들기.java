/* 프로그래머스 Level 2 문제 풀이
   *.JadenCase 문자열 만들기
       JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
      - s는 길이 1 이상인 문자열입니다.
      - s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
      - 첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
        
      */

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else if(s.charAt(i - 1) == ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
                }
            else{
                sb.append(s.charAt(i));   
                }
            }
        answer=sb.toString();
        return answer;            

}
}


//다른 사람의 풀이



class Solution {
	  public String solution(String s) {
	        String answer = "";
	        String[] sp = s.toLowerCase().split("");
	        boolean flag = true;

	        for(String ss : sp) {
	            answer += flag ? ss.toUpperCase() : ss;
	            flag = ss.equals(" ") ? true : false;
	        }

	        return answer;
	  }
	}