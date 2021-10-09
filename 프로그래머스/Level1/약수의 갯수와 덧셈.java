/* 프로그래머스 Level 1 문제 풀이
   *. 약수의 갯수와 덧셈
       */

class Solution {
    public int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++){ //왼쪽 시작, 오른쪽까지
        int count = 0;
        for (int j = 2; j < i; j++){
            if(i%j == 0){  
            count++;
        }
    }
    if (count%2 == 0) answer += i; //약수의 갯수가 짝수면 답 +1
    else answer -= i;
}
        return answer;
    }
}