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
		
		return answer;
    }
}//시저 암호 : 아스키 코드를 숫자로 확인하고 범위를 잡는 일을 조금 더 깔끔하게 할 수 있지 않을까