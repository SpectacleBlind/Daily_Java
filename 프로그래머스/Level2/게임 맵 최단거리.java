/* 프로그래머스 Level 2 문제 풀이
   *. 게임 맵 최단거리
       */



import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        int answer, x, y, nx, ny;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        boolean[][] visited = new boolean[n][m];
        Queue <Integer> queue = new LinkedList<>();
        
        queue.offer(0);
        queue.offer(0);
        visited[0][0] = true;
        while(!queue.isEmpty()){
            x= queue.poll();
            y= queue.poll();
            
            for(int i = 0; i < dx.length; i++){
                nx = x + dx[i];
                ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >=m) continue;
                if(maps[nx][ny]==0) continue;
                if(!visited[nx][ny]){
                    queue.offer(nx);
                    queue.offer(ny);
                    maps[nx][ny]=maps[x][y]+1;
                    visited[nx][ny]= true;
                }
            }
        }
        answer= maps[n-1][m-1];
        if(maps[n-1][m-1]==1) answer=-1;        
        
        return answer;
    }
}
