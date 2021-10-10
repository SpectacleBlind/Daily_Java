/* 프로그래머스 Level 1 문제 풀이
   *. 로또 번호 확인
       */

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int zero = 0;
        int win = 0;
        
        for(int chk = 0; chk < lottos.length; chk++){
            if(lottos[chk] == 0){
                zero++;
                continue;
            }
            else {
                for(int num = 0; num < win_nums.length ; num++){
                    if(lottos[chk] == win_nums[num]){
                        win++;
                        break;
                    }
                }
            }               
        }
        
        answer[0] = ((zero+win) >= 2) ? 7-(zero+win) : 6 ; 
        answer[1] = ((win) >= 2) ? 7-(win) : 6 ; 
        return answer;
    }
}


/*
 * 
테스트 1 〉	통과 (0.02ms, 79.9MB)
테스트 2 〉	통과 (0.02ms, 76MB)
테스트 3 〉	통과 (0.02ms, 73MB)
테스트 4 〉	통과 (0.01ms, 80.2MB)
테스트 5 〉	통과 (0.01ms, 74.1MB)
테스트 6 〉	통과 (0.01ms, 79.1MB)
테스트 7 〉	통과 (0.01ms, 70.9MB)
테스트 8 〉	통과 (0.02ms, 75.7MB)
테스트 9 〉	통과 (0.02ms, 75.8MB)
테스트 10 〉	통과 (0.01ms, 74.9MB)
테스트 11 〉	통과 (0.03ms, 67MB)
테스트 12 〉	통과 (0.02ms, 80.7MB)
테스트 13 〉	통과 (0.01ms, 77.9MB)
테스트 14 〉	통과 (0.01ms, 76.3MB)
테스트 15 〉	통과 (0.01ms, 78.3MB)
 */



class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int correct = 0;
        int zero = 0;
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                  correct++; 
                  break;
                } 
                if(lottos[i] == 0){
                   zero++;
                   break;
                }
                
            }
        }
        answer[0] = ((correct + zero) > 1) ? 7 - (correct + zero) : 6;
        answer[1] = (correct > 1) ? 7 - correct : 6 ;
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.01ms, 83.7MB)
테스트 2 〉	통과 (0.02ms, 78.5MB)
테스트 3 〉	통과 (0.02ms, 71.3MB)
테스트 4 〉	통과 (0.01ms, 71.6MB)
테스트 5 〉	통과 (0.02ms, 78MB)
테스트 6 〉	통과 (0.01ms, 76.7MB)
테스트 7 〉	통과 (0.02ms, 75.3MB)
테스트 8 〉	통과 (0.01ms, 76MB)
테스트 9 〉	통과 (0.02ms, 76.2MB)
테스트 10 〉	통과 (0.01ms, 83.1MB)
테스트 11 〉	통과 (0.02ms, 81.1MB)
테스트 12 〉	통과 (0.01ms, 78.2MB)
테스트 13 〉	통과 (0.02ms, 76.1MB)
테스트 14 〉	통과 (0.01ms, 74.7MB)
테스트 15 〉	통과 (0.01ms, 73.8MB)
*/