/* 프로그래머스 Level 1 문제 풀이
   7. 콜라즈 추측
      1-1. 입력된 수가 짝수라면 2로 나눕니다. 
      1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
      2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
      
      - 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
      - 입력된 수, num은 1 이상 8000000 미만인 정수입니다.
      */

class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (num != 1){
            if(num%2 == 1) {
                num = num*3+1;
                          }
            else num = num/2;
            answer++;
            
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}


//다른사람의 풀이

class Collatz {
    public int collatz(int num) {
    long n = (long)num;
    for(int i =0; i<500; i++){      
      if(n==1) return i; // 1이 된 경우, i로 출력
      n = (n%2==0) ? n/2 : n*3+1; // 삼항식으로 간단히 만듬
    }
    return -1; // 안될경우 -1로 출력
  }