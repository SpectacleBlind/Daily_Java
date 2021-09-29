/* 프로그래머스 Level 1 문제 풀이
   3. 행렬의 덧셈
      arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요. 
      - 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
      */

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++ ){
           for(int j = 0; j < arr1[0].length; j++ ){
            answer[i][j] = arr1[i][j]+arr2[i][j];
        } 
        }
        return answer;
    }
}
//answer를 만들어서, 이중 for문으로 각각 값을 입력

//다른사람의 풀이

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; //arr1을 우선 answer로 지정, 그럼 arr2만 더하면 되니까!
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}


