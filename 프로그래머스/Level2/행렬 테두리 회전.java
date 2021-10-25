/* 프로그래머스 Level 1 문제 풀이
   *. 행렬 테두리 회전
       */

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] map = newMap(rows,columns);
        int qLen = queries.length;
          for (int i = 0; i < qLen; i++) {
          answer[i] = rotate(map, queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
        }
        
        return answer;
    }
    
    public int[][] newMap(int a, int b){
        int[][] map = new int[a][b];
        int count = 1;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                map[i][j] = count++;
            }
        }
        return map;
    }
    
        private static int rotate(int[][] map, int x, int y, int x_, int y_) {
        int x1 = x-1;
        int y1 = y-1;
        int x2 = x_-1; 
        int y2 = y_-1; 
            
            
        int temp = map[x1][y1];
        int min = temp;

        for (int i = x1; i < x2; i++) {
            map[i][y1] = map[i + 1][y1];
            min = Math.min(min, map[i][y1]);
        }

        for (int i = y1; i < y2; i++) {
            map[x2][i] = map[x2][i + 1];
            min = Math.min(min, map[x2][i]);
        }

        for (int i = x2; i > x1; i--) {
            map[i][y2] = map[i - 1][y2];
            min = Math.min(min, map[i][y2]);
        }

        for (int i = y2; i > y1; i--) {
            map[x1][i] = map[x1][i - 1];
            min = Math.min(min, map[x1][i]);
        }
        map[x1][y1 + 1] = temp;

        return min;
    }
    
    
}