/* 프로그래머스 Level 2 문제 풀이
   *. 2개 이하로 다른 비트
   * */
   

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue <Integer> queue = new LinkedList<>();
        int num = speeds.length;
        int[] rest = new int[num];
        
        for(int i = 0; i < num; i++) {
            int temp = 100 - progresses[i];
            rest[i] = (temp%speeds[i] == 0) ? temp/speeds[i] : temp/speeds[i] +1 ;
        }

        for(int i = 0 ; i < num ; i++){
            if(rest[i] < rest[i+1]) queue.add(1);
            int count = 1;
            while (true) {
              if(rest[i] >= rest[i+1+count]) count++;
              else{
                queue.add(count+1);
                break;
              } 
            }
        }
        int[] answer = new int[queue.size()];        
        Iterator<Integer> iter = queue.iterator();
        int count = 0;
        while(iter.hasNext()){
            answer[count] = iter.next();
            count++;
        
        }

        return answer;
    }
}

//에러로 실패!


//Stack 사용한 방법

import java.util.*;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = speeds.length - 1 ; i >= 0 ; i--){   
        stack.add((100-progresses[i]) / speeds[i] + (((100 - progresses[i]) % speeds[i] > 0) ? 1 : 0));  //각 진행률 역순으로 넣기 (그래야 Stack으로 뺄때 맨 위부터 나옴)
        }
        
        List <Integer> list = new ArrayList<>();
        
        while(!stack.isEmpty()){
            int cnt = 1;
            int top = stack.pop(); //첫번째 기능 개발 
            
            while(!stack.isEmpty() && stack.peek() <= top){
                cnt++;
                stack.pop();
            }
            list.add(cnt); // 확인 후 넣기
        }
        
        int[] answer = new int[list.size()];
        
        
        for(int i = 0; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
            return answer;
    }
}