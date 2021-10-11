/* 프로그래머스 Level 1 문제 풀이
   *. 크레인 인형뽑기 게임
       */

import java.util.Stack;


class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack <Integer> stack = new Stack <>();
        stack.push(0);
        
        for(int i = 0; i < moves.length; i++){
            int select = moves[i] - 1;
            for(int j = 0; j < board.length; j++){
                if(board[j][select] != 0) {
                    if (stack.peek() == board[j][select]) {
                        stack.pop();
                        answer += 2;
                    }
                    else stack.push(board[j][select]);
                    board[j][select] = 0;
                    break;
                }
                
            }
        }
        return answer;
    }
}


/*
 * 
테스트 1 〉	통과 (0.17ms, 77.5MB)
테스트 2 〉	통과 (0.19ms, 79.4MB)
테스트 3 〉	통과 (0.13ms, 74.5MB)
테스트 4 〉	통과 (0.87ms, 68.2MB)
테스트 5 〉	통과 (0.16ms, 82.2MB)
테스트 6 〉	통과 (0.12ms, 76.3MB)
테스트 7 〉	통과 (0.20ms, 81MB)
테스트 8 〉	통과 (0.55ms, 78.7MB)
테스트 9 〉	통과 (0.39ms, 76.2MB)
테스트 10 〉	통과 (0.48ms, 74.7MB)
테스트 11 〉	통과 (0.81ms, 81.5MB)
 */



import java.util.Stack;
public class Solution {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;

    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for (int move : moves) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][move - 1] != 0) {
          if (stack.peek() == board[j][move - 1]) {
            stack.pop();
            answer += 2;
          } else {
           stack.push(board[j][move - 1]);
          }
          board[j][move - 1] = 0;
          break;
        }
      }
    }
    return answer;
  }
}
/*
테스트 1 〉	통과 (0.13ms, 71.7MB)
테스트 2 〉	통과 (0.19ms, 72MB)
테스트 3 〉	통과 (0.13ms, 67.1MB)
테스트 4 〉	통과 (1.12ms, 74.6MB)
테스트 5 〉	통과 (0.17ms, 74MB)
테스트 6 〉	통과 (0.15ms, 78.3MB)
테스트 7 〉	통과 (0.19ms, 73.6MB)
테스트 8 〉	통과 (0.64ms, 75.8MB)
테스트 9 〉	통과 (0.42ms, 73.4MB)
테스트 10 〉	통과 (0.54ms, 75MB)
테스트 11 〉	통과 (0.56ms, 77.2MB)
*/