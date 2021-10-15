/* 프로그래머스 Level 2 문제 풀이
   *. 다음 큰 숫자
      자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
      - n은 1,000,000 이하의 자연수 입니다.
       */

class Solution {
  public int solution(int n) {
  int bitcount = Integer.bitCount(n);
    for (int i = n+1 ; ; i++){
      if (bitcount == Integer.bitCount(i)) return i;
    } 
  }
}

// 
		
//다른사람의 풀이 
class Solution {
	  public int solution(int n) {
	      String nBi = Integer.toBinaryString(n); //n 이진수화.
	      int myCount = countOne(nBi);
	      
	      for(int i = n+1; ; i++){ //조건1.
	          String mBi = Integer.toBinaryString(i);
	          int count = countOne(mBi); //1의 갯수가 같은지 확인
	          if(count == myCount) // 조건2.
	               return i;
	      }
	  }
	  public int countOne(String nBi){
	      char[] args = nBi.toCharArray();
	      int count = 0;
	      for(char k : args){
	          if(k == '1') count++;
	      }
	      return count;
	  }
	  
	}


class Solution {
	  public int solution(int n) {
	      String nBi = Integer.toBinaryString(n); //n 이진수화.
	      int count = Integer.bitCount(n);
	      for(int i = n+1; ; i++){ //조건1.
	          String mBi = Integer.toBinaryString(i);
	          if(count == Integer.bitCount(i)) // 조건2.
	               return i;
	      }
	  }
	}