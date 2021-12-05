import java.util.*;

class Solution {
    List<Lense[]> board = new ArrayList<Lense[]>();
    List<Integer> cycle = new ArrayList<>();
        
    public int[] solution(String[] grid) {
        int cnt = 0;
        
        for(int i = 0; i < grid.length; i++){
            String[] temp = grid[i].split("");
            board.add(new Lense[temp.length]);
            for(int j = 0; j < temp.length; j++){
                board.get(i)[j] = new Lense(temp[j]);
            }
        }
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < board.get(i).length; j++){
                for(int k = 0; k < 4; k++){
                    while(true){
                        
                        if(board.get(i)[j].dir[k] == true){
                            if(cnt == 0){
                            }
                            else {cycle.add(cnt);
                                 cnt = 0;
                            }
                            break;
                        }
                        board.get(i)[j].dir[k] = true;
                        if(k==0){
                        i++; if(i==board.size()){i=0;}     
                         }
                         else if(k==1){
                         j++; if(j==board.get(i).length){j=0;} 
                         }
                        else if(k==2){
                         i--; if(i<0){i=board.size()-1;}
                        }
                        else if(k==3){
                         j--; if(j<0){j=board.get(i).length-1;}
                          }
                        k = reflect(i,j,k);
                        cnt++;
                    }
                }
            }
        }
        Collections.sort(cycle);
        
         int[] answer = new int[cycle.size()];
         for(int i=0;i<cycle.size();i++){
             answer[i]=cycle.get(i);
         }
        return answer;
    }
    public int reflect(int i,int j ,int k){
        int dir=k;
        
        if(board.get(i)[j].type.equals("S")){
        }
        else if(board.get(i)[j].type.equals("L")){   
            dir++; if(dir>3){dir=0;} 
        }
        else if(board.get(i)[j].type.equals("R")){
            dir--; if(dir<0){dir=3;}
        }
        return dir;
    }
}
    class Lense {
    boolean[] dir = new boolean[4];
    String type;
    
    public Lense(String type){
        this.type=type;
    }
    
}