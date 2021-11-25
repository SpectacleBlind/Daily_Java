import java.util.*;

class Solution {
    int answer = 0;
    
    public void chess(int[] qx, int [] qy, int cnt, int n){
        if(cnt == n){
            answer++;
            return;
        }
        for(int i =0; i<n; i++){
            int newx = cnt;
            int newy = i;
            int can = 1;
            
            for(int j = 0; j< cnt; j++){
                int befx = qx[j];
                int befy = qy[j];
                if(befy == newy){
                    can = 0;
                    break;
                }
                
                //대각선에 이미 퀸이 있는 경우
                if( ((newx-befx) == (newy-befy)) || ((newx-befx) == -(newy-befy)) ){
                    can = 0;
                    break;
                }
            }
            
            if(can == 1){
                qx[cnt] = newx;
                qy[cnt] = newy;
                chess(qx, qy, cnt+1, n);
            }
        }   
    }
    
    
    
    
    public int solution(int n) {
        
        int[] qx = new int[n];
        int[] qy = new int[n];
        
        for(int i = 0; i < n; i++){
            qx[0] = 0;
            qy[0] = i;
            chess(qx,qy,1,n);
        }
        
        return answer;
    }
}