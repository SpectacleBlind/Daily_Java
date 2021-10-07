/* 프로그래머스 Level 1 문제 풀이
   *. 3진법 뒤집기
       */

class Solution {
    public int solution(int n) {
        String third = "";
        while(n >= 3){
            third += n%3; // 이렇게 하면 뒤집어서 3진법 넣기 가능
            n /=3;
        }
        third += n;
        return Integer.parseInt(third, 3);
    }
}