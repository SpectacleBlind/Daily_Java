/* 프로그래머스 Level 1 문제 풀이
   *. 소수 만들기
       */

import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

for(int i = 0 ; i < nums.length-2 ; i++){
  for(int j = i+1 ; j < nums.length-1 ; j++){
    for(int k = j+1 ; k < nums.length ; k++){
     int prime = nums[i]+nums[j]+nums[k];
     //if (prime%2 != 0) break; 웃기게 짝수는 제외 하면 에러 난다
     list.add(prime);
     }
  }
}

for(int i : list){
    int count = 2;
    answer++;
        while(count < i){
            if(i%count == 0){
                answer--;
                break;
            }
            count++;
        }
}
    return answer;
    }}