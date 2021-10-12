/* 프로그래머스 Level 2 문제 풀이
   *. 가장 큰 수
       */

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] trans = new String[numbers.length];
        
        for(int i = 0; i < trans.length; i++){
            trans[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(trans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(trans[0].startsWith("0")) answer += "0";
        else {
            for(int j = 0; j<trans.length; j++){
                answer += trans[j];
            }
        }
        
        return answer;
    }
}

/*
 * 테스트 1 〉	통과 (1712.28ms, 408MB)
테스트 2 〉	통과 (641.69ms, 385MB)
테스트 3 〉	통과 (2813.55ms, 407MB)
테스트 4 〉	통과 (14.12ms, 98.7MB)
테스트 5 〉	통과 (1400.49ms, 401MB)
테스트 6 〉	통과 (1121.57ms, 381MB)
테스트 7 〉	통과 (1.97ms, 74.2MB)
테스트 8 〉	통과 (1.89ms, 75.8MB)
테스트 9 〉	통과 (1.76ms, 75.6MB)
테스트 10 〉	통과 (2.16ms, 76.5MB)
테스트 11 〉	통과 (2.55ms, 73.6MB)
 */


// StringBuilder 사용 시

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] trans = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < trans.length; i++){
            trans[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(trans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(trans[0].startsWith("0")){
            answer += "0";
            return answer;
        } 
        else {
            for(int j = 0; j<trans.length; j++){
                sb.append(trans[j]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (142.79ms, 137MB)
테스트 2 〉	통과 (71.76ms, 101MB)
테스트 3 〉	통과 (170.50ms, 147MB)
테스트 4 〉	통과 (10.31ms, 83.5MB)
테스트 5 〉	통과 (109.47ms, 122MB)
테스트 6 〉	통과 (103.89ms, 113MB)
테스트 7 〉	통과 (1.71ms, 73.2MB)
테스트 8 〉	통과 (1.63ms, 73.6MB)
테스트 9 〉	통과 (1.66ms, 77.6MB)
테스트 10 〉	통과 (1.58ms, 65.9MB)
테스트 11 〉	통과 (2.41ms, 75.6MB)

*/