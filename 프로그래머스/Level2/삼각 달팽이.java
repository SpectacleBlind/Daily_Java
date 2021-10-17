/* 프로그래머스 Level 2 문제 풀이
   *. 삼각 달팽이
       */

class Solution {
    public int[] solution(int n) {
        int max = (n*(n+1))/2;
        int[][] arr = new int[n][n];
        int [] answer = new int[max];
        
        int i = 0 ,j = 0, k = 1;
        arr[0][0] = 1;
        
        while(k < max){
            while(i+1 < n && arr[i+1][j] == 0) arr[++i][j] = ++k;
            while(j+1 < n && arr[i][j+1] == 0) arr[i][++j] = ++k;
            while(i-1 > 0 && arr[i-1][j-1] == 0) arr[--i][--j] = ++k;
         }
        
        k=0;
        
        for(int m = 0; m < n ; m++){
            for(int l = 0; l<=m; l++){
                answer[k++] = arr[m][l];
            }
        }
        
        return answer;
    }
}