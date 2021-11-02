/* 프로그래머스 Level 1 문제 풀이

   *. 수박수박수
   * */
   
class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i<=n ; i++){
        answer += (i%2==1) ? "수" : "박";
       }        
        return answer;
    }
}

/*
테스트 1 〉	통과 (3.43ms, 73.1MB)
테스트 2 〉	통과 (9.05ms, 86.3MB)
테스트 3 〉	통과 (6.66ms, 79.8MB)
테스트 4 〉	통과 (16.23ms, 91.1MB)
테스트 5 〉	통과 (5.28ms, 76.8MB)
테스트 6 〉	통과 (1.25ms, 68.7MB)
테스트 7 〉	통과 (1.30ms, 57.6MB)
테스트 8 〉	통과 (1.97ms, 69.6MB)
테스트 9 〉	통과 (1.43ms, 68.7MB)
테스트 10 〉	통과 (1.35ms, 73.5MB)
테스트 11 〉	통과 (1.32ms, 73.8MB)
테스트 12 〉	통과 (1.64ms, 71.3MB)
테스트 13 〉	통과 (1.55ms, 59MB)
테스트 14 〉	통과 (1.62ms, 69.8MB)
테스트 15 〉	통과 (42.69ms, 116MB)
테스트 16 〉	통과 (1.36ms, 69.5MB)
*/ 

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n ; i++){
        sb.append((i%2==1) ? "수" : "박");
       }        
        return sb.toString();
    }
}
/* 확실히 StringBuidler 사용하는 쪽이 더 빠르다
테스트 1 〉	통과 (0.11ms, 73MB)
테스트 2 〉	통과 (0.30ms, 73.9MB)
테스트 3 〉	통과 (0.26ms, 77.4MB)
테스트 4 〉	통과 (0.72ms, 80.5MB)
테스트 5 〉	통과 (0.36ms, 79.3MB)
테스트 6 〉	통과 (0.07ms, 74.8MB)
테스트 7 〉	통과 (0.05ms, 78.9MB)
테스트 8 〉	통과 (0.09ms, 74.2MB)
테스트 9 〉	통과 (0.08ms, 72.9MB)
테스트 10 〉	통과 (0.08ms, 74.6MB)
테스트 11 〉	통과 (0.07ms, 82.2MB)
테스트 12 〉	통과 (0.05ms, 73.7MB)
테스트 13 〉	통과 (0.05ms, 78.7MB)
테스트 14 〉	통과 (0.08ms, 73.6MB)
테스트 15 〉	통과 (1.48ms, 82.3MB)
테스트 16 〉	통과 (0.04ms, 77.1MB)*/