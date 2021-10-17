/* 프로그래머스 Level 1 문제 풀이
   *. 영어 끝말잇기
       */

import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List <String> list = new ArrayList <>();
        boolean chk = true;
        
        list.add(words[0]);
        
        for(int i = 1 ; i < words.length; i++){
            if(list.contains(words[i])){   
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                chk = false;
                break;
            }
            
            list.add(words[i]);
            
             if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
               answer [0] = (i%n)+1;
               answer [1] = (i/n)+1;
               chk = false;
               break;
            }
        }
        
        
        
        if(chk) return new int[]{0, 0};
return answer;       
    }
}


/*
 * 테스트 1 〉	통과 (0.04ms, 85.3MB)
테스트 2 〉	통과 (0.05ms, 74.6MB)
테스트 3 〉	통과 (0.03ms, 75.4MB)
테스트 4 〉	통과 (0.05ms, 81MB)
테스트 5 〉	통과 (0.08ms, 78.5MB)
테스트 6 〉	통과 (0.04ms, 83.2MB)
테스트 7 〉	통과 (0.04ms, 75.4MB)
테스트 8 〉	통과 (0.03ms, 75.8MB)
테스트 9 〉	통과 (0.08ms, 85MB)
테스트 10 〉	통과 (0.10ms, 77.7MB)
테스트 11 〉	통과 (0.08ms, 75.9MB)
테스트 12 〉	통과 (0.07ms, 83.3MB)
테스트 13 〉	통과 (0.05ms, 75.5MB)
테스트 14 〉	통과 (0.06ms, 74.7MB)
테스트 15 〉	통과 (0.04ms, 77.8MB)
테스트 16 〉	통과 (0.04ms, 76.1MB)
테스트 17 〉	통과 (0.06ms, 78MB)
테스트 18 〉	통과 (0.04ms, 74.8MB)
테스트 19 〉	통과 (0.03ms, 67.8MB)
테스트 20 〉	통과 (0.29ms, 78.3MB)
*/
 */
//다른사람의 풀이

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashMap<String, Integer> contains = new HashMap<String, Integer>();
        contains.put(words[0], 1);

        int pos = 1;
        int[] turn = new int[n];
        turn[0]++;

        for (int i = 1; i < words.length; i++) {

            turn[pos]++;

            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || contains.get(words[i]) != null) {
                answer[0] = pos + 1;
                answer[1] = turn[pos];
                break;
            }

            contains.put(words[i], 1);

            pos++;
            if (pos >= n) pos = 0;

        }

        return answer;
    }
}



/*
테스트 1 〉	통과 (0.03ms, 73.9MB)
테스트 2 〉	통과 (0.05ms, 70.1MB)
테스트 3 〉	통과 (0.03ms, 75.3MB)
테스트 4 〉	통과 (0.04ms, 73MB)
테스트 5 〉	통과 (0.04ms, 87.3MB)
테스트 6 〉	통과 (0.03ms, 77.4MB)
테스트 7 〉	통과 (0.04ms, 70.8MB)
테스트 8 〉	통과 (0.03ms, 72.9MB)
테스트 9 〉	통과 (0.04ms, 88.6MB)
테스트 10 〉	통과 (0.08ms, 74.2MB)
테스트 11 〉	통과 (0.06ms, 79.6MB)
테스트 12 〉	통과 (0.04ms, 77.1MB)
테스트 13 〉	통과 (0.03ms, 75.7MB)
테스트 14 〉	통과 (0.04ms, 78.7MB)
테스트 15 〉	통과 (0.02ms, 74.2MB)
테스트 16 〉	통과 (0.02ms, 76.1MB)
테스트 17 〉	통과 (0.03ms, 75.8MB)
테스트 18 〉	통과 (0.03ms, 78.6MB)
테스트 19 〉	통과 (0.02ms, 74.1MB)
테스트 20 〉	통과 (0.06ms, 79MB)
*/