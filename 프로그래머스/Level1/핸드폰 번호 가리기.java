/* 프로그래머스 Level 1 문제 풀이
   4. 핸드폰 번호 가리기
      전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
      - s는 길이 4 이상, 20이하인 문자열입니다.
      */

class Solution {
public String solution(String phone_number) { 
    String answer = ""; 
    for(int i = 0; i < phone_number.length(); i++){
        if(i < phone_number.length()-4){ 
            answer += "*"; 
        }
        else{ 
         answer += phone_number.charAt(i); 
        }
    } 
    return answer; 
} 
}
//answer를 만들어서, 이중 for문으로 각각 값을 입력

//다른사람의 풀이

class Solution {
	  public String solution(String phone_number) {
		     char[] ch = phone_number.toCharArray();//array로 만들기
		     for(int i = 0; i < ch.length - 4; i ++){
		         ch[i] = '*';//각 자리수 *표 처리
		     }
		     return String.valueOf(ch);
		  }
		}


