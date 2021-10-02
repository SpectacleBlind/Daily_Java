/* 프로그래머스 Level 1 문제 풀이
   *. 최소직사각형
      모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
      모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
      - 
      
       */

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length ; i++){
            Arrays.sort(sizes[i]);
        }
        
int max1 = 0;
int max2 = 0; 

for(int i = 0; i<sizes.length ; i++){
  max1 = (sizes[i][0] > max1) ? sizes[i][0] : max1;
  max2 = (sizes[i][1] > max2) ? sizes[i][1] : max2;
}

int answer = max1*max2;
        return answer;
    }
}



/*
테스트 1 〉	통과 (0.37ms, 73.6MB)
테스트 2 〉	통과 (0.47ms, 67.2MB)
테스트 3 〉	통과 (0.37ms, 65.6MB)
테스트 4 〉	통과 (0.52ms, 62.3MB)
테스트 5 〉	통과 (0.36ms, 73MB)
테스트 6 〉	통과 (0.51ms, 74.1MB)
테스트 7 〉	통과 (0.35ms, 71.1MB)
테스트 8 〉	통과 (0.34ms, 70.3MB)
테스트 9 〉	통과 (0.39ms, 71.6MB)
테스트 10 〉	통과 (0.38ms, 69.4MB)
테스트 11 〉	통과 (0.49ms, 76.5MB)
테스트 12 〉	통과 (0.51ms, 78MB)
테스트 13 〉	통과 (1.01ms, 77.2MB)
테스트 14 〉	통과 (1.45ms, 78.7MB)
테스트 15 〉	통과 (1.63ms, 78.7MB)
테스트 16 〉	통과 (2.43ms, 82.3MB)
테스트 17 〉	통과 (2.98ms, 83MB)
테스트 18 〉	통과 (3.37ms, 85.7MB)
테스트 19 〉	통과 (2.88ms, 82.6MB)
테스트 20 〉	통과 (2.73ms, 82.3MB)
*/


// version 2


import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(it -> it[0] * it[1]).get();
    }
}

/*
테스트 1 〉	통과 (0.74ms, 81.4MB)
테스트 2 〉	통과 (1.05ms, 76.7MB)
테스트 3 〉	통과 (0.98ms, 77.3MB)
테스트 4 〉	통과 (0.78ms, 75.7MB)
테스트 5 〉	통과 (0.94ms, 73.2MB)
테스트 6 〉	통과 (0.87ms, 77.6MB)
테스트 7 〉	통과 (0.99ms, 71.9MB)
테스트 8 〉	통과 (0.85ms, 74.4MB)
테스트 9 〉	통과 (0.95ms, 75.2MB)
테스트 10 〉	통과 (1.21ms, 74.3MB)
테스트 11 〉	통과 (1.01ms, 75.8MB)
테스트 12 〉	통과 (1.46ms, 76.2MB)
테스트 13 〉	통과 (2.16ms, 79.7MB)
테스트 14 〉	통과 (1.53ms, 79.2MB)
테스트 15 〉	통과 (1.44ms, 78.3MB)
테스트 16 〉	통과 (1.62ms, 80.2MB)
테스트 17 〉	통과 (2.12ms, 82.3MB)
테스트 18 〉	통과 (2.02ms, 86.9MB)
테스트 19 〉	통과 (4.75ms, 88.1MB)
테스트 20 〉	통과 (2.32ms, 87.6MB)
*/
