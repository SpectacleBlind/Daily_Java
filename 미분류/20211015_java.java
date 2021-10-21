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




class Solution {
    public int solution(String s) {
     int answer = 0;
     String[] word  = {"zero","one","two","three","four","five","six","seven","eight","nine"};      
     String [] num = {"0" ,"1","2","3","4","5","6","7","8","9"};
     for(int i = 0; i < word.length; i++){
       s = s.replace(word[i],num[i]);
     }
     answer = Integer.parseInt(s);
     return answer;
    }
}





class Solution {
    public int solution(String s) {
        String[] word = {"one" , "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        for(int i = 0; i < num.length ; i++) s.replace(word[i], num[i]);
        return Integer.parseInt(s);
    }
}



