/* 프로그래머스 Level 1 문제 풀이

   *. 다트게임
   * */
   

class Solution {
    public int solution(String dartResult) {
        int[] result = new int[3];
        int n = 0;
        int idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(c == '1'){
                if(dartResult.charAt(i+1) == '0') {
                    n = 10;
                    i++;
                }
                else n = 1;
            }
            else if(c >= '2' && c <='9' || c =='0') n = Integer.parseInt(String.valueOf(c));
            else {
                switch (c){
                    case 'S' :
                        result[idx++] = n;
                        break;
                    case 'D' :
                        result[idx++] = n*n;
                        break;
                    case 'T' :
                        result[idx++] = n*n*n;
                        break;
                    case '*' :
                        if (idx > 1){
                            result[idx-2] *= 2;
                            result[idx-1] *= 2;
                        }
                        else result[idx-1] *= 2;
                        break;                   
                        
                    case '#' :
                        result[idx-1] *= (-1);
                        break;
                }
            }
        }
        return result[0]+result[1]+result[2];
    }
}

/*
테스트 1 〉	통과 (0.04ms, 75.2MB)
테스트 2 〉	통과 (0.03ms, 75.3MB)
테스트 3 〉	통과 (0.05ms, 70.7MB)
테스트 4 〉	통과 (0.02ms, 76.8MB)
테스트 5 〉	통과 (0.04ms, 77.5MB)
테스트 6 〉	통과 (0.04ms, 86.7MB)
테스트 7 〉	통과 (0.03ms, 73.4MB)
테스트 8 〉	통과 (0.03ms, 75.4MB)
테스트 9 〉	통과 (0.02ms, 73MB)
테스트 10 〉	통과 (0.04ms, 74.2MB)
테스트 11 〉	통과 (0.03ms, 78.3MB)
테스트 12 〉	통과 (0.03ms, 72.1MB)
테스트 13 〉	통과 (0.03ms, 73.7MB)
테스트 14 〉	통과 (0.03ms, 76.1MB)
테스트 15 〉	통과 (0.02ms, 75.4MB)
테스트 16 〉	통과 (0.03ms, 69MB)
테스트 17 〉	통과 (0.03ms, 78.6MB)
테스트 18 〉	통과 (0.03ms, 78.9MB)
테스트 19 〉	통과 (0.03ms, 71.2MB)
테스트 20 〉	통과 (0.03ms, 74MB)
테스트 21 〉	통과 (0.02ms, 75.9MB)
테스트 22 〉	통과 (0.03ms, 77.8MB)
테스트 23 〉	통과 (0.03ms, 76MB)
테스트 24 〉	통과 (0.05ms, 65.5MB)
테스트 25 〉	통과 (0.03ms, 76.6MB)
테스트 26 〉	통과 (0.02ms, 73.5MB)
테스트 27 〉	통과 (0.03ms, 73.9MB)
테스트 28 〉	통과 (0.03ms, 74.5MB)
테스트 29 〉	통과 (0.04ms, 74MB)
테스트 30 〉	통과 (0.02ms, 78.7MB)
테스트 31 〉	통과 (0.03ms, 76.8MB)
테스트 32 〉	통과 (0.03ms, 72.8MB)

*/

class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int index = 0, n = 0, now = 0;
        int answer = 0;        
        
        for (int i = 0; i < dartResult.length() ; i++){
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)){
                n = Character.getNumericValue(c);
                if(c == '1' && dartResult.charAt(i+1) == '0'){
                    n = 10;
                    i++;
                }
            now++; 
            }
            else {
        switch (c) {
                case 'S':
                    score[index++] = n;
                    break;
                    
                case 'D':
                    score[index++] = (int) Math.pow(n, 2);
                    break;
                    
                case 'T':
                    score[index++] = (int) Math.pow(n, 3); 
                    break;
                    
                case '*':   
                    index = index - 2 < 0 ? 0 : index - 2;
                    while (index < now) {
                        score[index++] *= 2;
                    }
                    n = 0;
                    break;
                    
                case '#':    
                    score[index-1] *= -1;    
                    n = 0;
                    break;
                }
            }
        
        }
        for (int i : score) {
            answer += i;
        }
 
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.05ms, 76.6MB)
테스트 2 〉	통과 (0.06ms, 74.6MB)
테스트 3 〉	통과 (0.07ms, 93.8MB)
테스트 4 〉	통과 (0.07ms, 72.4MB)
테스트 5 〉	통과 (0.07ms, 73.7MB)
테스트 6 〉	통과 (0.08ms, 76.1MB)
테스트 7 〉	통과 (0.08ms, 75.6MB)
테스트 8 〉	통과 (0.07ms, 70.7MB)
테스트 9 〉	통과 (0.09ms, 75.2MB)
테스트 10 〉	통과 (0.05ms, 77.1MB)
테스트 11 〉	통과 (0.06ms, 73MB)
테스트 12 〉	통과 (0.08ms, 71.5MB)
테스트 13 〉	통과 (0.05ms, 73.2MB)
테스트 14 〉	통과 (0.06ms, 78.7MB)
테스트 15 〉	통과 (0.09ms, 76.5MB)
테스트 16 〉	통과 (0.07ms, 74.1MB)
테스트 17 〉	통과 (0.06ms, 72.8MB)
테스트 18 〉	통과 (0.06ms, 72.6MB)
테스트 19 〉	통과 (0.06ms, 71.5MB)
테스트 20 〉	통과 (0.09ms, 76MB)
테스트 21 〉	통과 (0.08ms, 80.9MB)
테스트 22 〉	통과 (0.09ms, 78.5MB)
테스트 23 〉	통과 (0.08ms, 71MB)
테스트 24 〉	통과 (0.08ms, 71.3MB)
테스트 25 〉	통과 (0.07ms, 85.1MB)
테스트 26 〉	통과 (0.05ms, 71.1MB)
테스트 27 〉	통과 (0.06ms, 72.9MB)
테스트 28 〉	통과 (0.06ms, 75.3MB)
테스트 29 〉	통과 (0.09ms, 80.2MB)
테스트 30 〉	통과 (0.08ms, 75.4MB)
테스트 31 〉	통과 (0.05ms, 74.9MB)
테스트 32 〉	통과 (0.06ms, 74.6MB)
*/