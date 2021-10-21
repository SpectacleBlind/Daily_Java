class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] coorx = {0, 0, 1, -1}; //U,D,R,L 순서
        int[] coory = {1, -1, 0, 0};
        boolean[][][][] chk = new boolean[11][11][11][11];
        int x,dx = 5;
        int y,dy = 5;
        dirs = dirs.replace('U','0'); 
        dirs = dirs.replace('D','1');
        dirs = dirs.replace('R','2');
        dirs = dirs.replace('L','3');
        
        for(int i = 0; i < dirs.length(); i++){
            x = dx;
            y = dy;
            int point = dirs.charAt(i) - '0';
            if(x + coorx[point] >= 0 && x + coorx[point] <= 10  && (y + coory[point]) >= 0 && (y + coory[point]) <= 10){
               dx = (x + coorx[point]); //4 3 3 4 5 5 4
               dy = (y + coory[point]); //5 5 6 6 6 5 5
                if(chk[x][y][dx][dy] == false && chk[dx][dy][x][y] == false) {
                    chk[x][y][dx][dy] = true;
                    chk[dx][dy][x][y] = true;
                    answer++; //1 2
                    
                }
            }
        }
            return answer;
    }
}                                              
            
            
       /*     
            if(x + coorx[point] >= 0 && x + coorx[point] <= 9  && (y + coory[point] >= 0 && (y + coory[point] <= 9) && chk[x][y] != true) {
                chk[x][y] = true;
                answer++;
                }
            else{
                x -= coorx[i];
                y -= coory[i];
            }
        }
        
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
        Set<String> keySet = map.keySet(); //의상종류.
        
        for(String key : keySet) {
        	answer *= map.get(key)+1; 
        }
        return answer-1; //아무것도 안입는 경우의 수 제거
    }
}




















import java.util.HashMap;
import java.util.Set;


class Solution {
    public int solution(String[][] clothes) {
        HashMap <String, Integer> map = new HashMap <>();
        int answer = 1;

        for(int i = 0; i < clothes.length; i++) map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        Set <String> keyset = map.keySet();
        for(String s : keyset) answer *=map.get(s)+1;

        return answer-1;
    }
}








