/* 프로그래머스 Level 1 문제 풀이
   *. 나누어 떨어지는 숫자 배열
       array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
      - arr은 자연수를 담은 배열입니다.
      - 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
      - divisor는 자연수입니다.
      - array는 길이 1 이상인 배열입니다.
       */

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
          int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if (arr[i]%divisor == 0){
                a1.add(arr[i]);
            }
        }
            if(a1.isEmpty()){
                a1.add(-1);
            }
        
        
         answer = new int[a1.size()];
          
          for(int i=0; i<a1.size(); i++) {
              answer[i] = a1.get(i);
          }
          
          Arrays.sort(answer);
        return answer;
    }
}
/*테스트 1 〉	통과 (0.40ms, 72.1MB)
테스트 2 〉	통과 (0.58ms, 72.1MB)
테스트 3 〉	통과 (0.36ms, 73MB)
테스트 4 〉	통과 (0.42ms, 59.5MB)
테스트 5 〉	통과 (0.39ms, 72.5MB)
테스트 6 〉	통과 (1.71ms, 77.9MB)
테스트 7 〉	통과 (0.56ms, 67.8MB)
테스트 8 〉	통과 (0.37ms, 59.6MB)
테스트 9 〉	통과 (0.36ms, 58.9MB)
테스트 10 〉	통과 (0.73ms, 71.8MB)
테스트 11 〉	통과 (0.48ms, 59.9MB)
테스트 12 〉	통과 (0.39ms, 74.8MB)
테스트 13 〉	통과 (0.40ms, 74.4MB)
테스트 14 〉	통과 (0.62ms, 67.9MB)
테스트 15 〉	통과 (0.63ms, 69.4MB)
테스트 16 〉	통과 (0.46ms, 68MB)
*/


import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0; 
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]%divisor == 0){
                count++;
        }        
    }       
        if(count == 0){
        int[] answer = {-1};
          return answer;
        }
        int[] answer = new int[count];
        count = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]%divisor == 0){
                answer[count] = arr[i];
                count++;
        }        
    }
                        
    Arrays.sort(answer);
    return answer;    
}
}


/*
테스트 1 〉	통과 (0.34ms, 72.1MB)
테스트 2 〉	통과 (0.33ms, 74.5MB)
테스트 3 〉	통과 (0.31ms, 77.9MB)
테스트 4 〉	통과 (0.37ms, 77.3MB)
테스트 5 〉	통과 (0.34ms, 78.7MB)
테스트 6 〉	통과 (1.26ms, 80.2MB)
테스트 7 〉	통과 (0.08ms, 84.6MB)
테스트 8 〉	통과 (0.01ms, 71.9MB)
테스트 9 〉	통과 (0.40ms, 73MB)
테스트 10 〉	통과 (0.46ms, 75.9MB)
테스트 11 〉	통과 (0.36ms, 73.8MB)
테스트 12 〉	통과 (0.43ms, 73.3MB)
테스트 13 〉	통과 (0.19ms, 79.2MB)
테스트 14 〉	통과 (0.44ms, 75MB)
테스트 15 〉	통과 (0.41ms, 75MB)
테스트 16 〉	통과 (0.37ms, 78.7MB)
*/




//다른 사람의 풀이

import java.util.Arrays;

class Divisible {
  public int[] divisible(int[] array, int divisor) {
      //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
      return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
  }
  // 아래는 테스트로 출력해 보기 위한 코드입니다.
  public static void main(String[] args) {
      Divisible div = new Divisible();
      int[] array = {5, 9, 7, 10};
      System.out.println( Arrays.toString( div.divisible(array, 5) ));
  }
}

/*
테스트 1 〉	통과 (2.35ms, 86MB)
테스트 2 〉	통과 (2.48ms, 67.6MB)
테스트 3 〉	통과 (3.16ms, 65.4MB)
테스트 4 〉	통과 (3.44ms, 73.4MB)
테스트 5 〉	통과 (2.24ms, 77.2MB)
테스트 6 〉	통과 (5.71ms, 80.5MB)
테스트 7 〉	통과 (2.78ms, 74MB)
테스트 8 〉	통과 (3.39ms, 76.6MB)
테스트 9 〉	통과 (3.38ms, 73.2MB)
테스트 10 〉	통과 (3.65ms, 69.6MB)
테스트 11 〉	통과 (2.64ms, 79.2MB)
테스트 12 〉	통과 (2.54ms, 76MB)
테스트 13 〉	통과 (3.93ms, 90.7MB)
테스트 14 〉	통과 (2.90ms, 78.2MB)
테스트 15 〉	통과 (2.67ms, 80.3MB)
테스트 16 〉	통과 (2.46ms, 80.3MB)
그런데 느리다... 신기하네
*/ 