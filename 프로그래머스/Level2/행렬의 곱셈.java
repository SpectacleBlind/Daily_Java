/* 프로그래머스 Level 2 문제 풀이
   *. 행렬의 곱셈
       2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
      - 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
      - 행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
      - 곱할 수 있는 배열만 주어집니다.      
      */


class Solution {
 public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[0].length; j++)
                for (int n = 0; n < arr1[0].length; n++)
                    answer[i][j] += (arr1[i][n] * arr2[n][j]);

        return answer;
    }
}