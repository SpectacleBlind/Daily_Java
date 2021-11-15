import java.util.*;

class Solution {
    
    ArrayList<int[]> seq;
    public int[][] solution(int n) {
        seq = new ArrayList<>();  //array 1개씩 가져오기
        
        hanoi(n, 1, 3, 2); 
        
        int[][] answer = new int[seq.size()][2];
        for(int i = 0 ; i < seq.size() ; ++i){
            int[] temp = seq.get(i);
            answer[i][0] = temp[0]; 
            answer[i][1] = temp[1];  
        }
        
        return answer;
    }
    
    private void hanoi(int n, int from, int to, int inter){
        int[] move = {from, to};
        
        if(n == 1) {
            seq.add(move);
        } else {
            hanoi(n - 1, from, inter, to);
            seq.add(move);
            hanoi(n - 1, inter, to, from);   
        }
    }
}