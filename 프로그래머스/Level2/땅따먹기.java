/* 프로그래머스 Level 2 문제 풀이
   *. 땅따먹기
      마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값을 return하는 solution 함수를 완성해 주세요.
       */

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int n = land.length;

        int[][] dp = new int[n][4];        
        
        for(int i = 0 ; i < 4;i++)
            dp[0][i] = land[0][i];    
        
        for(int i = 1;i<n;i++){
            for(int j =0;j< 4;j++){
                int max = 0;
                for(int k=0;k<4;k++){
                    if(j == k) continue;
                    max = Math.max(max,dp[i-1][k]);
                }
                dp[i][j] = land[i][j] + max;
            }
        }
        for(int i=0;i<4;i++)
            answer = Math.max(answer,dp[n-1][i]);
        
        
        return answer;
    }
}


// 
		
//다른사람의 풀이 
class Hopscotch {
    int hopscotch(int[][] board, int size) {
        return hopscotch(board, size, 0, -1);
    }

    private int hopscotch(int[][] board, int size, int y, int idx) {
      if (y >= size) return 0;
      int answer = Integer.MIN_VALUE;
      for (int i = 0; i < 4; i++) {
        if (i != idx) {
          answer = Math.max(hopscotch(board, size, y + 1, i) + board[y][i], answer);
        }
      }
      return answer;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}