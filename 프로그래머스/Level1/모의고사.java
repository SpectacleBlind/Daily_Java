/* 프로그래머스 Level 1 문제 풀이
   *. 모의고사
       */

import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5}; 
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5}; // 각 인원별 찍기 답안
        int answer1=0, answer2 =0, answer3 =0;
        
        for(int i =0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) answer1++;
            if(person2[i%person2.length] == answers[i]) answer2++;
            if(person3[i%person3.length] == answers[i]) answer3++;
        } // 각 Array 값이랑 같은게 있으면, +1
        int max = Math.max(Math.max(answer1, answer2),answer3); 
        ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList에 Max 값 넣기
        if(max==answer1) list.add(1); 
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}