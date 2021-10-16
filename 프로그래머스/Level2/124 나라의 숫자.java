/* 프로그래머스 Level 2 문제 풀이
   *. 124 나라의 숫자
   * */
   

class Solution {
    public String solution(int n) {
        String[] numbers = {"4" , "1", "2"};
        String answer = "";
        int num = n;
        
        while (num>0){
            int remain = num % 3;
            num /= 3;
            
            if(remain == 0) num--;
            answer = numbers[remain] + answer;
        }
        return answer;
    }
}