/* 프로그래머스 Level 1 문제 풀이
   *. 나누어 떨어지는 숫자 배열
       array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
      - arr은 자연수를 담은 배열입니다.
      - 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
      - divisor는 자연수입니다.
      - array는 길이 1 이상인 배열입니다.
       */

import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]) sb.append(arr[i]);
        }

        int[] answer = new int[sb.length()];
        
        for(int i = 0; i < answer.length ; i++){
            answer[i] = sb.charAt(i)-48;
        }


        return answer;
    }
}
/*
 * 테스트 1 〉	통과 (0.05ms, 65.8MB)
테스트 2 〉	통과 (0.11ms, 75.4MB)
테스트 3 〉	통과 (0.06ms, 76.7MB)
테스트 4 〉	통과 (0.08ms, 70.5MB)
테스트 5 〉	통과 (0.07ms, 74.6MB)
테스트 6 〉	통과 (0.05ms, 77.4MB)
테스트 7 〉	통과 (0.04ms, 75.6MB)
테스트 8 〉	통과 (0.04ms, 76.9MB)
테스트 9 〉	통과 (0.07ms, 79MB)
테스트 10 〉	통과 (0.04ms, 68.6MB)
테스트 11 〉	통과 (0.04ms, 75.3MB)
테스트 12 〉	통과 (0.04ms, 75.6MB)
테스트 13 〉	통과 (0.06ms, 75.8MB)
테스트 14 〉	통과 (0.06ms, 75.8MB)
테스트 15 〉	통과 (0.10ms, 82.1MB)
테스트 16 〉	통과 (0.09ms, 81.5MB)
테스트 17 〉	통과 (0.05ms, 78.5MB)
효율성  테스트
테스트 1 〉	통과 (36.18ms, 122MB)
테스트 2 〉	통과 (35.50ms, 122MB)
테스트 3 〉	통과 (35.69ms, 122MB)
테스트 4 〉	통과 (34.43ms, 122MB)
*/


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(arr[0]);
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1] != arr[i]){
                sb.append(arr[i]);
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i = 0; i < count ; i++){
            answer[i] = sb.charAt(i)-48;
        }



        return answer;
    }
}


/*
테스트 1 〉	통과 (0.02ms, 59.3MB)
테스트 2 〉	통과 (0.07ms, 60.1MB)
테스트 3 〉	통과 (0.09ms, 68.8MB)
테스트 4 〉	통과 (0.07ms, 70.9MB)
테스트 5 〉	통과 (0.05ms, 71.2MB)
테스트 6 〉	통과 (0.04ms, 71.9MB)
테스트 7 〉	통과 (0.04ms, 70.3MB)
테스트 8 〉	통과 (0.05ms, 73.7MB)
테스트 9 〉	통과 (0.08ms, 72.3MB)
테스트 10 〉	통과 (0.07ms, 71.7MB)
테스트 11 〉	통과 (0.05ms, 76.2MB)
테스트 12 〉	통과 (0.05ms, 70MB)
테스트 13 〉	통과 (0.08ms, 71.3MB)
테스트 14 〉	통과 (0.06ms, 74.4MB)
테스트 15 〉	통과 (0.11ms, 58MB)
테스트 16 〉	통과 (0.12ms, 71.3MB)
테스트 17 〉	통과 (0.02ms, 60.7MB)
효율성  테스트
테스트 1 〉	통과 (34.22ms, 123MB)
테스트 2 〉	통과 (31.20ms, 122MB)
테스트 3 〉	통과 (32.83ms, 121MB)
테스트 4 〉	통과 (41.11ms, 122MB)
*/




//다른 사람의 풀이

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.02ms, 76.2MB)
테스트 2 〉	통과 (0.04ms, 76.8MB)
테스트 3 〉	통과 (0.06ms, 80.3MB)
테스트 4 〉	통과 (0.06ms, 73.2MB)
테스트 5 〉	통과 (0.04ms, 74.6MB)
테스트 6 〉	통과 (0.07ms, 81.4MB)
테스트 7 〉	통과 (0.04ms, 79.2MB)
테스트 8 〉	통과 (0.08ms, 77.7MB)
테스트 9 〉	통과 (0.05ms, 75MB)
테스트 10 〉	통과 (0.07ms, 68.5MB)
테스트 11 〉	통과 (0.05ms, 79.1MB)
테스트 12 〉	통과 (0.06ms, 75.4MB)
테스트 13 〉	통과 (0.05ms, 76.2MB)
테스트 14 〉	통과 (0.07ms, 75.7MB)
테스트 15 〉	통과 (0.04ms, 74.2MB)
테스트 16 〉	통과 (0.05ms, 74.3MB)
테스트 17 〉	통과 (0.03ms, 77.4MB)
효율성  테스트
테스트 1 〉	통과 (26.67ms, 125MB)
테스트 2 〉	통과 (23.41ms, 124MB)
테스트 3 〉	통과 (28.15ms, 124MB)
테스트 4 〉	통과 (27.46ms, 127MB)
*/ 