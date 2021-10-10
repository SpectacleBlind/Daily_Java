/* 프로그래머스 Level 1 문제 풀이
   *. 음양 더하기
       */

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<signs.length; i++){
        int temp = absolutes[i]*((signs[i])?1:(-1)); //signs로 음양 판단
        answer +=temp;
        }
        return answer;
    }
}