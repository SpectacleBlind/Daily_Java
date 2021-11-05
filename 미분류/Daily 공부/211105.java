class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min = len-1;
        for(int i = 0; i < len; i++) {
        	answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            int next = i+1;
            while(next<len && name.charAt(next) =='A') next++;
            min = Math.min(min,2*i+len-next);
        }
        answer += min;
        return answer;
    }
}




class Solution {
    public int solution(String name) {
        int answer = 0;
		int len = name.length();
		int min = len - 1;
		for (int i = 0; i < len; i++){
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i)+1); //각 자리수 변환 값
			int next = i+1; // 다음것 확인 
			while(next<len && name.charAt(next) == 'A') next++; //다음게 A일때 앞으로 가는게 좋을지, 뒤로 가는게 좋을지 확인
			min = Math.min(min,2*i+len-next);
		}
		answer += min;
        return answer;
    }
}