class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length(); j++) map[i][j] = board[i].charAt(j);
        }
       
        int answer = 0;
        boolean flag = true;
        
        while(flag){
            flag = false;
            
            int[][] check = new int[m][n];
            
            for(int i = 0; i < map.length -1 ; i++){
                for(int j = 0; j < map[i].length -1 ; j++){
                    if(map[i][j] == '0') continue;
                    if((map[i][j] == map[i+1][j]) && (map[i][j] == map[i][j+1]) && (map[i][j] == map[i+1][j+1])){
                        check[i][j] = 1;
                        check[i+1][j] = 1;
                        check[i][j+1] = 1;
                        check[i+1][j+1] = 1;
                        flag = true;
                    }
                }
            }
            
            for(int i = 0; i < check.length; i++){
                for(int j = 0; j<check[i].length; j++){
                    if(check[i][j] ==1) {
                        answer++;
                        for(int k = j-1; k>=0; k--){
                            map[i][k+1] = map[i][k];
                            map[i][k] = 0;
                        }
                    }
                    
                }
            }
            
            
            
        }
        return answer;
    }
}