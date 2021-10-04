/* 프로그래머스 Level 1 문제 풀이
   *. 부족한 금액 계산하기
      놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 
      모자라는지를 return 하도록 solution 함수를 완성하세요.
      - 금액이 부족하지 않으면 0을 return 하세요.
      
       */

class Solution {
    public long solution(long price, long money, long count) {
        long answer = (((((count+1)*count/2)*price)-money) > 0) ? ((((count+1)*count/2)*price)-money) : 0;
        return  answer;
    }}
        


// version 2


class Solution {
    public long solution(long price, long money, long count) {
       long result = price * ((long)count * (1 + count) / 2);
        
        if(result <= money) {
            return 0;
        }
        else 
        {
            return result - (long)money;    
        }
    }
}
