/* 프로그래머스 Level 1 문제 풀이
   10.제일 작은 수 제거하기 
       정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
      - arr은 길이 1 이상인 배열입니다.
      - 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
      */

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
         if (arr.length <= 1){
         int[] answer2 = {-1};
             return answer2;
        }
        else{
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++){
            min = min < arr[i] ? min : arr[i];
        }
        int index = 0;
         for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
               continue;
            } 
             else { 
               answer[index++] = arr[j];
            }
       
        }
        return answer;
    }
}
}

//다른 사람의 풀이



class Solution {
	  public int[] solution(int[] arr) {
	      if(arr.length == 1){
	          int[] answer = {-1};
	          return answer;
	      }

	      int[] answer = new int[arr.length-1];
	      int minIndex=0;

	      for(int i=0;i<arr.length;i++){
	          if(arr[minIndex]>arr[i]){
	              minIndex = i;
	          }
	      }
	      for(int i=minIndex+1;i<arr.length;i++){
	          arr[i-1] = arr[i];
	      }
	      for(int i=0;i<answer.length;i++){
	          answer[i] = arr[i];
	      }
	      return answer;
	  }
	}