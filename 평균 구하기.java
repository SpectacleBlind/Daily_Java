/* 프로그래머스 Level 1 문제 풀이
   6. 평균 구하기
      정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
      - arr은 길이 1 이상, 100 이하인 배열입니다.
      - arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
      */

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length ; i++){
            answer += arr[i]; 
        }
        answer = answer/arr.length;
        return answer;
    }
}


//다른사람의 풀이

public class GetMean {
    public int getMean(int[] array) {
      if(array == null){//array가 빈 것인 경우, 에러 체크용
        return 0;
      }

      int ret = 0;
      if(array != null){
        for(int n : array){//for each문
            ret += n;
        }
      }
        return ret / array.length;
    }
