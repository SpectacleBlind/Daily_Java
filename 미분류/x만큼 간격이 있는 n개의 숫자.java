/* 프로그래머스 Level 1 문제 풀이
   2. x만큼 간격이 있는 n개의 숫자
      함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
      다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요. 
      - x는 -10000000 이상, 10000000 이하인 정수입니다.
      - n은 1000 이하인 자연수입니다.
      */

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        for(int i = 0; i<n;i++){
            answer [i] = (long)x*(i+1);
        }
        return answer;
    }
}
//차례대로 x와 n을 곱하는 형태

//다른사람의 풀이

import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

//첫째 값을 그냥 x로 받고, 나머지를 이전 값 +x로 받는다.