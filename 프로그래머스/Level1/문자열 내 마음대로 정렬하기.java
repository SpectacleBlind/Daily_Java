/* 프로그래머스 Level 1 문제 풀이
   *. 문자열 내 마음대로 정렬하기
      문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
      각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다
      - 
      
       */

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        String[] temp = new String[length];
        String[] answer = new String[length];
        
        for(int i = 0; i < length; i++){
            temp[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i < length; i++){
            answer[i] = temp[i].substring(1);
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (12.95ms, 80.3MB)
테스트 2 〉	통과 (13.73ms, 78.8MB)
테스트 3 〉	통과 (11.14ms, 78.4MB)
테스트 4 〉	통과 (10.89ms, 77.4MB)
테스트 5 〉	통과 (9.94ms, 88.2MB)
테스트 6 〉	통과 (13.06ms, 81.5MB)
테스트 7 〉	통과 (12.44ms, 74.1MB)
테스트 8 〉	통과 (10.54ms, 71.4MB)
테스트 9 〉	통과 (13.06ms, 88.7MB)
테스트 10 〉	통과 (11.21ms, 77.8MB)
테스트 11 〉	통과 (8.91ms, 75.8MB)
테스트 12 〉	통과 (15.17ms, 83.5MB)
*/


// version 2


import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (9.61ms, 74.9MB)
테스트 2 〉	통과 (9.13ms, 76MB)
테스트 3 〉	통과 (9.25ms, 90.2MB)
테스트 4 〉	통과 (9.10ms, 76.5MB)
테스트 5 〉	통과 (9.32ms, 82MB)
테스트 6 〉	통과 (9.51ms, 78.1MB)
테스트 7 〉	통과 (9.05ms, 78.8MB)
테스트 8 〉	통과 (9.77ms, 94.2MB)
테스트 9 〉	통과 (8.80ms, 74.8MB)
테스트 10 〉	통과 (9.18ms, 76.3MB)
테스트 11 〉	통과 (8.89ms, 83.5MB)
테스트 12 〉	통과 (9.31ms, 75.8MB)
*/
