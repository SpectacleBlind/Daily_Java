/* 프로그래머스 Level 1 문제 풀이
   *. 완주하지 못한 선수
       */

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap <String, Integer> map = new HashMap<>();

        for(String start : participant) map.put(start, map.getOrDefault(start,0)+1);
        for(String fine : completion) map.put(fine,map.get(fine)-1);
        for(String retire : map.keySet()){
           if(map.get(retire) != 0){
             answer = retire;
             break;
             }
           }
        return answer;
    }
}


//

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}

//해시맵 안쓴거, 이것도 빠르고 좋다. Sort 한다음, 처음으로 다른 값 나오면 그거 도출