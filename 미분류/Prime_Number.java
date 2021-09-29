class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            int index = 0;
            for(int j = 2 ; j < i ; j++){
                if(i%j == 0){
                    index++;
                }
                if(index>2){
                    break;
                }
            }
            if(index == 0){answer++;}
        }

        return answer;
    }
}
//소수 찾기 프로그램이지만, 시간 초과
//접근 : 소수는 2 제외, 전부 홀수(2n+1)


class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            boolean check = true;
           for(int j = 2 ; j*j <= i ; j++){
                if(i%j == 0){
                    check = false;
                    break;
                }
                }
            if(check){answer++;}
            }

           return answer;
        }
    }

// check를 boolean으로, j 범위를 대폭 축소 하였을때

class Solution {
	public int solution(int n) {
		int answer = 0; 
		boolean[] sosu =new boolean [n+1]; 
		for(int i=2; i<=n ; i++) 
			sosu[i]=true; //2~n번째수를 true로 초기화 
		//제곱근 구하기 
		int root=(int)Math.sqrt(n); 
		for(int i=2; i<=root; i++){ 
			//2~루트n까지 검사 
			if(sosu[i]==true){ 
				//i번째의 수가 소수일 때 
				for(int j=i; i*j<=n; j++) 
					//그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문) 
					sosu[i*j]=false; 
				} 
			} 
		for(int i =2; i<=n; i++) {
			if(sosu[i]==true) 
				//소수의 개수 세기 
				answer++; 
			} return 
					answer; } }
//다른 사람의 풀이, 에라토스테네스의 체 공식을 이용한 코드..