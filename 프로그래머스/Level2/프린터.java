/* 프로그래머스 Level 2 문제 풀이
   *. 프린터

       */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] copy = priorities;
        Arrays.sort(copy);
        
        
        Queue<Integer> queue = new LinkedList<>();
        for(int p : priorities){
            queue.offer(p);
        }
        
        int count = copy.length;
        while(!queue.isEmpty){
            int temp = queue.poll();
            if (temp == copy[count])
        }
        
        
        return answer;
    }
}
//



// 다른 사람의 풀이

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}