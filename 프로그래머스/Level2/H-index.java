/* 프로그래머스 Level 2 문제 풀이
   *. H-index
       */

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        Arrays.sort(citations);
        
        for(int i = 0; i < length; i++){
            int h = length - i;
            if(citations[i] >= h){
                answer = h;
                break;
                    
            }
        }

        return answer;
    }
}

//


//다른 사람의 풀이

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}
