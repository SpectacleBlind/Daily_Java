/* 프로그래머스 Level 1 문제 풀이
   17. 시저 암호
       문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
       
      - 공백은 아무리 밀어도 공백입니다.
      - s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
      - s의 길이는 8000이하입니다.
      - n은 1 이상, 25이하인 자연수입니다.
       */


class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
			char point = s.charAt(i);
			
             if(point >= 'a' && point <= 'z') {
				if(point + n > 'z') answer += (char)(point + n - 26);
				else answer += (char)(point + n);
			}
			else if(point >= 'A' && point <= 'Z') {
				if(point + n > 'Z') answer += (char)(point + n-26);
				else answer += (char)(point + n);
			}
			else answer += (char)point;

		}
		
//다른사람의 풀이
class Caesar {
    String caesar(String s, int n) {
        String result = "";
    
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLowerCase(ch)) {
        ch = (char) ((ch - 'a' + n) % 26 + 'a'); // char로 변환하는 것 유의
      } else if (Character.isUpperCase(ch)) {
        ch = (char) ((ch - 'A' + n) % 26 + 'A');
      }
      result += ch;
    }
        return result;
    }
