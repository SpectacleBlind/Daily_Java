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

//Stack을 처음 사용한 코딩. Stack을 Import하여, peek,pop,push활용.