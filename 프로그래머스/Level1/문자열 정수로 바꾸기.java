/* 프로그래머스 Level 1 문제 풀이
   17. 문자열을 정수로 바꾸기
       문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
       
      - s의 길이는 1 이상 5이하입니다.
      - s의 맨앞에는 부호(+, -)가 올 수 있습니다.
      - s는 부호와 숫자로만 이루어져있습니다.
      - s는 "0"으로 시작하지 않습니다.
       */


class Solution {
    public int solution(String s) {
    int answer = 0;
        StringBuilder sb= new StringBuilder();
        if(s.charAt(0) == '+'){
            for(int i = 1; i<s.length(); i++){
                sb.append(s.charAt(i));
            }
            answer = Integer.parseInt(sb.toString());
        }
        else if(s.charAt(0) == '-'){
            for(int i = 1; i<s.length(); i++){
                sb.append(s.charAt(i));
            }
             answer = Integer.parseInt(sb.toString())*-1;
        }
        else {
                    for(int i = 0; i<s.length(); i++){
                sb.append(s.charAt(i));
            }
                        answer = Integer.parseInt(sb.toString());
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.08ms, 71.7MB)
테스트 2 〉	통과 (0.04ms, 58.2MB)
테스트 3 〉	통과 (0.04ms, 69.9MB)
테스트 4 〉	통과 (0.04ms, 59.9MB)
테스트 5 〉	통과 (0.05ms, 70.5MB)
테스트 6 〉	통과 (0.04ms, 68.6MB)
테스트 7 〉	통과 (0.05ms, 75.6MB)
테스트 8 〉	통과 (0.05ms, 67.8MB)
테스트 9 〉	통과 (0.04ms, 71.7MB)
테스트 10 〉	통과 (0.10ms, 71.8MB)
테스트 11 〉	통과 (0.04ms, 60MB)
테스트 12 〉	통과 (0.03ms, 72.7MB)
테스트 13 〉	통과 (0.04ms, 72.2MB)
테스트 14 〉	통과 (0.04ms, 71.7MB)
테스트 15 〉	통과 (0.04ms, 71.7MB)
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-'){
                answer = Integer.parseInt(s.substring(1))*(-1);
            }
        else if(s.charAt(0) == '+'){
                answer = Integer.parseInt(s.substring(1));
            }
        else answer = Integer.parseInt(s);
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 77.7MB)
테스트 2 〉	통과 (0.03ms, 81MB)
테스트 3 〉	통과 (0.02ms, 73.6MB)
테스트 4 〉	통과 (0.03ms, 73.9MB)
테스트 5 〉	통과 (0.03ms, 77.8MB)
테스트 6 〉	통과 (0.03ms, 69.6MB)
테스트 7 〉	통과 (0.03ms, 71.9MB)
테스트 8 〉	통과 (0.02ms, 71.6MB)
테스트 9 〉	통과 (0.02ms, 76.4MB)
테스트 10 〉	통과 (0.03ms, 61.7MB)
테스트 11 〉	통과 (0.02ms, 70.2MB)
테스트 12 〉	통과 (0.03ms, 73.7MB)
테스트 13 〉	통과 (0.02ms, 74.7MB)
테스트 14 〉	통과 (0.02ms, 74.9MB)
테스트 15 〉	통과 (0.03ms, 72.6MB)
*/