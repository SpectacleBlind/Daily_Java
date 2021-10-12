//중간에 짝수면 바로 튀는 것을 만들어도 효과는 미미하다..? 어떤것은 총 소요 시간이 반으로 줄긴 했다.


class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++){
         boolean chk = true;
          for(int j = 2; j <= Math.sqrt(i); j++){
           if(i%j == 0) {
            chk = false;
            break;
          }} if(chk) answer++;
        }
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 71.4MB)
테스트 2 〉	통과 (0.06ms, 77.3MB)
테스트 3 〉	통과 (0.12ms, 77.8MB)
테스트 4 〉	통과 (0.15ms, 75.1MB)
테스트 5 〉	통과 (0.15ms, 76.4MB)
테스트 6 〉	통과 (3.58ms, 76MB)
테스트 7 〉	통과 (0.77ms, 77MB)
테스트 8 〉	통과 (2.07ms, 76MB)
테스트 9 〉	통과 (3.90ms, 75.5MB)
테스트 10 〉	통과 (66.41ms, 82.5MB)
테스트 11 〉	통과 (193.03ms, 102MB)
테스트 12 〉	통과 (52.30ms, 86.5MB)
효율성  테스트
테스트 1 〉	통과 (215.68ms, 51.9MB)
테스트 2 〉	통과 (193.21ms, 52.3MB)
테스트 3 〉	통과 (208.69ms, 52MB)
테스트 4 〉	통과 (180.65ms, 51.8MB)



class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++){
         boolean chk = true;
            if( i >2 && i%2==0) continue;
          for(int j = 2; j <= Math.sqrt(i); j++){
           if(i%j == 0) {
            chk = false;
            break;
          }} if(chk) answer++;
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.03ms, 78.8MB)
테스트 2 〉	통과 (0.04ms, 78.8MB)
테스트 3 〉	통과 (0.08ms, 74.8MB)
테스트 4 〉	통과 (0.14ms, 76.5MB)
테스트 5 〉	통과 (0.16ms, 75.7MB)
테스트 6 〉	통과 (3.27ms, 80.2MB)
테스트 7 〉	통과 (0.71ms, 77.4MB)
테스트 8 〉	통과 (1.66ms, 73MB)
테스트 9 〉	통과 (2.26ms, 74.5MB)
테스트 10 〉	통과 (39.88ms, 73.6MB)
테스트 11 〉	통과 (193.41ms, 85MB)
테스트 12 〉	통과 (46.62ms, 86.3MB)
효율성  테스트
테스트 1 〉	통과 (188.01ms, 52MB)
테스트 2 〉	통과 (182.66ms, 52MB)
테스트 3 〉	통과 (206.45ms, 52MB)
테스트 4 〉	통과 (214.68ms, 52MB)
