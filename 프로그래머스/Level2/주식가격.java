/* 프로그래머스 Level 2 문제 풀이
   *.주식가격
       초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
      - prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
      - prices의 길이는 2 이상 100,000 이하입니다.        
      */

class Solution {
    public int[] solution(int[] prices) {
        int time = prices.length;
        int[] answer = new int[time];
        
        for(int i = 0; i < time; i++ ){
          for(int j = i+1; j < time ; j++){
              if(prices[i] <= prices[j]) answer[i]++;
              else {
               answer[i]++;
                  break;
              }
          }
        }
        return answer;
    }
}

//다른 사람의 풀이



import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}
