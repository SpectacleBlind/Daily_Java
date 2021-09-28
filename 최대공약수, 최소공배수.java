/* 프로그래머스 Level 1 문제 풀이
   8. 최대공약수, 최소공배수
      두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
      - 두 수는 1이상 1000000이하의 자연수입니다.
      */

class Solution {
    public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int big,small;
      if(n>m){
          big = n; small = m;
      }else{
          big = m; small = n;
      }
      answer[0] = gcd(big,small);
      answer[1] = big*small/answer[0];
      
      return answer;
  }
  public int gcd(int a,int b){//최대공약수 구하는 메소드
      if(a % b == 0)
          return b;
      return gcd(b,a%b);//안나눠지면, a%b 넣어 계속 진행
  }
}


//다른사람의 풀이

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int mini = 0;
        int maxi = 1;

        for(int i = 1; i<=a; i++) 
                    if(a%i==0&&b%i==0)
                        maxi = i;

                for(int i = a*b; i>0; i--)
                    if(i%a==0&&i%b==0)
                        mini = i;

        answer[0] = maxi;
        answer[1] = mini;

        return answer;
    }