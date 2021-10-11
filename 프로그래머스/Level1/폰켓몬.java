/* 프로그래머스 Level 1 문제 풀이
   *. 폰켓몬
       */

class Solution {
    public int solution(int[] nums) {
        int half = (nums.length)/2;
        boolean[] check = new boolean[200000]; //최대값 기준으로 불리언 작성
        int count = 0;
        int answer = 0;
        for (int i = 0; i < nums.length ; i++){
            if(check[(nums[i]-1)] != true){
            check[(nums[i]-1)] = true;
            count++; // 카운트는 결국 다른 폰켓몬 갯수
            }
            }
        
     
        answer = ((count) > half ? half : count); 
        return answer;
    }
}