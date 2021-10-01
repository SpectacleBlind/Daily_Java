/* 프로그래머스 Level 1 문제 풀이
   *. 문자열 내 p와 y의 개수
      대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 
      같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
      - 문자열 s의 길이 : 50 이하의 자연수
      - 문자열 s는 알파벳으로만 이루어져 있습니다.
       */

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
           if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }
        
        answer = (p == y) ? true : false;


        return answer;
    }
}
		
//개선 버전

class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
           if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        return p == y;
    }
}