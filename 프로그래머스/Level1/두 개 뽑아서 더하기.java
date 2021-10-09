/* 프로그래머스 Level 1 문제 풀이
   *. 두 개 뽑아서 더하기
       */

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int len = numbers.length;
        int temp;
        
        for(int i = 0; i < len - 1; i++){
            for(int j = i+1; j < len ; j++){
                temp = numbers[i]+numbers[j];
                if (arr.indexOf(temp) < 0){ //ArrayList 안에 값이 있으면 Pass 없으면 입력
                    arr.add(temp);
                }
            }
        }
        int[] answer =Integer.parseInt(arr.toString());
        /*int[] answer = new int[arr.size()];
        for(int i = 0; i<answer.length ; i++){
            answer[i] = arr.get(i);
        }*/
        
        Arrays.sort(answer);
        return answer;
    }
}