/* 프로그래머스 Level 2 문제 풀이
   *. 위장
       */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String , Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0) + 1);
        }
        Set<String> keySet = map.keySet(); 
        
        for(String key : keySet) {
        	answer *= map.get(key)+1; 
        }
        return answer-1; 
    }
}

//


//다른 사람의 풀이
import java.util.HashMap;
import java.util.Iterator;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
