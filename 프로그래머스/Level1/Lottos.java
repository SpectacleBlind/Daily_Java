/* 프로그래머스 Level 1 문제 풀이
   *. 로또의 최고 순위와 최저 순위

      */

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int correct = 0;
        int zero = 0;
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                  correct++; 
                  break;
                } 
                if(lottos[i] == 0){
                   zero++;
                   break;
                }
                
            }
        }
        answer[0] = ((correct + zero) > 1) ? 7 - (correct + zero) : 6;
        answer[1] = (correct > 1) ? 7 - correct : 6 ;
        return answer;
    }
}
//다른사람의 풀이

