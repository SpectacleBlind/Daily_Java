/* 프로그래머스 Level 1 문제 풀이
   *. K 번째 수
       */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int m = 0; m < commands.length ; m++){
           i = commands[m][0];
           j = commands[m][1];
           k = commands[m][2];
           int count = 0 ;
           int[] mid = new int[j-i+1];
            
           for (int l = i-1; l <= j-1 ; l++){
               mid[count] = array[l];
               count++;
           }
            Arrays.sort(mid);
            answer[m] = mid[k-1];
        }
        return answer;
    }
}