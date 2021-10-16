/* 프로그래머스 Level 2 문제 풀이
   *. 더 맵게
   * */


	import java.util.*;

	class Solution {
	    public int solution(int[] scoville, int K) {
	        int answer = 0;

	        PriorityQueue <Integer> pq = new PriorityQueue<>();
	        
	        for (int data : scoville) pq.add(data);
	        
	        while(true) {
	            if(K>pq.peek()) {
	                pq.add(pq.poll()+pq.poll()*2);
	                answer++;
	            }
	            else break;
	            
	            if(pq.size() == 1 && pq.peek()<K) {
	                answer = -1;
	                break;
	            }
	        }
	         
	        return answer;
	    }
	}