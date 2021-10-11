/* 프로그래머스 Level 1 문제 풀이
   *. 체육복
       */

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n+2]; //n+2로 입력 i+1까지 에러 없이 받으려면 필요 
        int answer = n;

        for (int l : lost) 
            people[l-1]--; // 체육복 잃어버린 사람은 count -
        for (int r : reserve) 
            people[r-1]++; // 체육복 여분 있는 사람은 count +

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) { // 잃어버린 사람이면
                if(people[i-1] == 1) { // 전 옆사람이 +1 이면
                    people[i]++; //잃어버린거 회복
                    people[i-1]--; // 여분 삭제
                }else if(people[i+1] == 1) { //반복
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
}