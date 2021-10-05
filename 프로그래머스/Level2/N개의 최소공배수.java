/* 프로그래머스 Level 2 문제 풀이
   *.N개의 최소공배수
       n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
      - arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.
      */

class Solution {
    
    // 최대 공약수
    public int GCD(int a, int b){      
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0)      return a;
        else            return GCD(b, a%b);
    }
    
    // 최소 공배수 - a*b / 최대공약수
    public int LCM(int a, int b){
        return a*b / GCD(a, b);
    }
    
  public int solution(int[] arr) {
      int answer = arr[0];
      for(int i=1; i<arr.length; i++)
          answer = LCM(answer, arr[i]);
      return answer;
  }
}


//유클리드 호제법을 외우자!!!!!!