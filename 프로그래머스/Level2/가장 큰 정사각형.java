/* 프로그래머스 Level 2 문제 풀이
   *. 가장 큰 정사각형
       */

class Solution
{
    public int solution(int [][] map){
        int answer = 0, row = map.length, col = map[0].length;

        for(int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
              if(map[i][j] != 0){
                  map[i][j] = Math.min(Math.min(map[i-1][j],map[i][j-1]),map[i-1][j-1])+1;
                  answer = Math.max(answer, map[i][j]);
              }
            }
        }
        if(answer == 0) 
            for(int i = 0; i < col; i++)
                if(map[0][i] == 1||map[i][0] == 1){
                return 1;
                }

        return answer*answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 77.7MB)
테스트 2 〉	통과 (0.02ms, 77.8MB)
테스트 3 〉	통과 (0.03ms, 75.7MB)
테스트 4 〉	통과 (0.03ms, 72.6MB)
테스트 5 〉	통과 (0.04ms, 74.2MB)
테스트 6 〉	통과 (0.03ms, 72.3MB)
테스트 7 〉	통과 (0.03ms, 77.7MB)
테스트 8 〉	통과 (0.02ms, 73.7MB)
테스트 9 〉	통과 (0.03ms, 79.6MB)
테스트 10 〉	통과 (0.03ms, 77.9MB)
테스트 11 〉	통과 (0.04ms, 77.2MB)
테스트 12 〉	통과 (0.03ms, 73MB)
테스트 13 〉	통과 (0.03ms, 81.2MB)
테스트 14 〉	통과 (0.03ms, 75.7MB)
테스트 15 〉	통과 (0.05ms, 76.2MB)
테스트 16 〉	통과 (0.03ms, 80.7MB)
테스트 17 〉	통과 (0.03ms, 75.2MB)
테스트 18 〉	통과 (0.23ms, 76.4MB)
테스트 19 〉	통과 (0.25ms, 73.3MB)
효율성  테스트
테스트 1 〉	통과 (14.93ms, 90MB)
테스트 2 〉	통과 (16.18ms, 89.1MB)
테스트 3 〉	통과 (16.23ms, 89MB)
용량적인 면에서 감소는 미미하나 속도는 빠르다!
*/


//다른 사람의 풀이

class Solution
{
    public int solution(int [][] board){
        int answer = 0, row = board.length, col = board[0].length;
        int[][] map = new int[row+1][col+1];
        
      
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
            	map[i+1][j+1] = board[i][j];
            }}
        
        for(int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
              if(map[i][j] != 0){
                  map[i][j] = Math.min(Math.min(map[i-1][j],map[i][j-1]),map[i-1][j-1])+1;
                  answer = Math.max(answer, map[i][j]);
              }
            }
        }

        return answer*answer;
    }
}

/*
테스트 1 〉	통과 (0.04ms, 70.6MB)
테스트 2 〉	통과 (0.03ms, 72.7MB)
테스트 3 〉	통과 (0.08ms, 75.7MB)
테스트 4 〉	통과 (0.06ms, 74.3MB)
테스트 5 〉	통과 (0.04ms, 73.5MB)
테스트 6 〉	통과 (0.05ms, 77.2MB)
테스트 7 〉	통과 (0.03ms, 74.6MB)
테스트 8 〉	통과 (0.03ms, 77.3MB)
테스트 9 〉	통과 (0.06ms, 74.9MB)
테스트 10 〉	통과 (0.05ms, 71.2MB)
테스트 11 〉	통과 (0.04ms, 82.9MB)
테스트 12 〉	통과 (0.09ms, 77.7MB)
테스트 13 〉	통과 (0.04ms, 76.4MB)
테스트 14 〉	통과 (0.04ms, 80MB)
테스트 15 〉	통과 (0.04ms, 75.6MB)
테스트 16 〉	통과 (0.04ms, 76.6MB)
테스트 17 〉	통과 (0.05ms, 75MB)
테스트 18 〉	통과 (0.47ms, 72.4MB)
테스트 19 〉	통과 (0.50ms, 79.7MB)
효율성  테스트
테스트 1 〉	통과 (20.38ms, 89.1MB)
테스트 2 〉	통과 (22.79ms, 89.4MB)
테스트 3 〉	통과 (22.37ms, 89.3MB)


*/