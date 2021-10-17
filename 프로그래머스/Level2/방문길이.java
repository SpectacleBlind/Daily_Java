/* 프로그래머스 Level 2 문제 풀이
   *. 방문 길이
   * */
   

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