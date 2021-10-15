/* 프로그래머스 Level 2 문제 풀이
   *. 구명보트
       무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
       사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 
       모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
       */

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int temp = 0;
        int index = 0;
        
        for(int i = people.length - 1 ; index <= i ; i--){
            if(people[i] + people[index] > limit){
                answer++;
            }
            else{
                answer++;
                index++;
            }
        }
            
        return answer;
    }
}




/*테스트 1 〉	통과 (1.37ms, 84MB)
테스트 2 〉	통과 (0.87ms, 76.6MB)
테스트 3 〉	통과 (1.21ms, 74.9MB)
테스트 4 〉	통과 (1.20ms, 74.8MB)
테스트 5 〉	통과 (0.84ms, 74.7MB)
테스트 6 〉	통과 (0.72ms, 76.5MB)
테스트 7 〉	통과 (0.74ms, 72.9MB)
테스트 8 〉	통과 (0.33ms, 73.5MB)
테스트 9 〉	통과 (0.52ms, 79.1MB)
테스트 10 〉	통과 (1.12ms, 75.6MB)
테스트 11 〉	통과 (1.13ms, 75.1MB)
테스트 12 〉	통과 (1.03ms, 77.3MB)
테스트 13 〉	통과 (1.06ms, 78MB)
테스트 14 〉	통과 (1.30ms, 77.3MB)
테스트 15 〉	통과 (0.58ms, 72.6MB)
효율성  테스트
테스트 1 〉	통과 (16.33ms, 62.8MB)
테스트 2 〉	통과 (9.56ms, 56MB)
테스트 3 〉	통과 (10.58ms, 54.9MB)
테스트 4 〉	통과 (7.42ms, 53.3MB)
테스트 5 〉	통과 (9.06ms, 53.1MB)
 */

// 다른 사람의 풀이

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        return people.length - i;
    }
}

/*
 * 테스트 1 〉	통과 (1.39ms, 73.3MB)
테스트 2 〉	통과 (0.91ms, 77.2MB)
테스트 3 〉	통과 (1.16ms, 77MB)
테스트 4 〉	통과 (1.20ms, 83.9MB)
테스트 5 〉	통과 (0.81ms, 76.7MB)
테스트 6 〉	통과 (0.62ms, 75.5MB)
테스트 7 〉	통과 (0.75ms, 86.8MB)
테스트 8 〉	통과 (0.40ms, 74.1MB)
테스트 9 〉	통과 (0.41ms, 69.8MB)
테스트 10 〉	통과 (1.05ms, 73.8MB)
테스트 11 〉	통과 (1.19ms, 75.3MB)
테스트 12 〉	통과 (1.03ms, 76.3MB)
테스트 13 〉	통과 (1.02ms, 76.7MB)
테스트 14 〉	통과 (0.89ms, 76.6MB)
테스트 15 〉	통과 (0.44ms, 86.3MB)
효율성  테스트
테스트 1 〉	통과 (10.55ms, 57MB)
테스트 2 〉	통과 (10.24ms, 53.7MB)
테스트 3 〉	통과 (13.32ms, 70.3MB)
테스트 4 〉	통과 (7.36ms, 53.4MB)
테스트 5 〉	통과 (9.02ms, 53.8MB)
*/
