/* 프로그래머스 Level 2 문제 풀이

   *. 올바른 괄호
   * */
   

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 73.4MB)
테스트 2 〉	통과 (0.01ms, 73.8MB)
테스트 3 〉	통과 (0.01ms, 73.2MB)
테스트 4 〉	통과 (0.02ms, 76.1MB)
테스트 5 〉	통과 (0.02ms, 77.8MB)
테스트 6 〉	통과 (0.02ms, 71.4MB)
테스트 7 〉	통과 (0.01ms, 73.3MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.02ms, 71.2MB)
테스트 10 〉	통과 (0.02ms, 76.6MB)
테스트 11 〉	통과 (0.02ms, 67.2MB)
테스트 12 〉	통과 (0.02ms, 84.9MB)
테스트 13 〉	통과 (0.02ms, 76.9MB)
테스트 14 〉	통과 (0.03ms, 76.5MB)
테스트 15 〉	통과 (0.02ms, 74.2MB)
테스트 16 〉	통과 (0.03ms, 72.4MB)
테스트 17 〉	통과 (0.03ms, 73.4MB)
테스트 18 〉	통과 (0.03ms, 71.7MB)
효율성  테스트
테스트 1 〉	통과 (7.67ms, 53.2MB)
테스트 2 〉	통과 (6.24ms, 52.4MB)

*/



class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == '(') count++;
          else count--;
          if(count<0) return false;
         }
        return answer = (count == 0) ? true : false;
    }
}
/*
테스트 1 〉	통과 (0.02ms, 75.3MB)
테스트 2 〉	통과 (0.02ms, 72.8MB)
테스트 3 〉	통과 (0.02ms, 75.6MB)
테스트 4 〉	통과 (0.02ms, 74.1MB)
테스트 5 〉	통과 (0.02ms, 87.9MB)
테스트 6 〉	통과 (0.01ms, 80.6MB)
테스트 7 〉	통과 (0.03ms, 75.7MB)
테스트 8 〉	통과 (0.01ms, 75.7MB)
테스트 9 〉	통과 (0.03ms, 74.5MB)
테스트 10 〉	통과 (0.01ms, 75.4MB)
테스트 11 〉	통과 (0.03ms, 77.7MB)
테스트 12 〉	통과 (0.03ms, 74.4MB)
테스트 13 〉	통과 (0.02ms, 83.6MB)
테스트 14 〉	통과 (0.03ms, 78.8MB)
테스트 15 〉	통과 (0.04ms, 71.8MB)
테스트 16 〉	통과 (0.04ms, 77.6MB)
테스트 17 〉	통과 (0.03ms, 76MB)
테스트 18 〉	통과 (0.03ms, 78MB)
효율성  테스트
테스트 1 〉	통과 (6.69ms, 52.9MB)
테스트 2 〉	통과 (5.69ms, 52.5MB)
*/