import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int pri : priorities){
            pq.offer(pri);
        }
        
        while(!pq.isEmpty()){
            for(int i = 0; i<priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;
                    if(location == i){
                        pq.clear();
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}






import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
		PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int pri : priorities) pq.offer(pri);
		
		while(!pq.isEmpty()){
			for(int i = 0; i < priorities.length; i++){
				if(pq.peek() == priorities[i]){
					pq.poll();
					answer++;
					if(location == i){
                      pq.clear(); //pq 해제를 안하면 런타임 에러 발생!
                      break;  
                    } 
		}
    }
           
}
         return answer;
    }
}