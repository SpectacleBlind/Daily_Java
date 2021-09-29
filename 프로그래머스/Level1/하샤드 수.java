/* 프로그래머스 Level 1 문제 풀이
   5. 하샤드 수
      각 자리수의 합으로 나눠지는 하샤드 수 판별 문제
      - x는 1 이상, 10000 이하인 정수입니다.
      */

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int number = x;
        
        while (number > 0){
            sum += number%10;
            number = number/10;
        }
        
        if(x%sum == 0){
        answer = true;
        }
        return answer;
    }
}
//answer를 만들어서, 이중 for문으로 각각 값을 입력

//다른사람의 풀이

public class HarshadNumber{
    public boolean isHarshad(int num){

    String[] temp = String.valueOf(num).split("");//num을 각 자리별로 String화

    int sum = 0;
    for (String s : temp) {
        sum += Integer.parseInt(s); //String인 값을 Int로 변환하여 더함
    }

    if (num % sum == 0) {
            return true;
    } else {
      return false;
    }
    }

