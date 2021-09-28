/* 프로그래머스 Level 1 문제 풀이
   9. 짝수와 홀수
      두 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
      - num은 int 범위의 정수입니다.
      - 0은 짝수입니다.
      */

class Solution {
    public String solution(int num) {
        String answer = ((num%2 == 0) ? "Even" : "Odd");
        return answer;
    }
}

//다른사람의 풀이

public class EvenOrOdd {
    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even": "Odd"; //리턴을 그냥 삼항연산자로 하면 된다!
    }