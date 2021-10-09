/* 프로그래머스 Level 1 문제 풀이
   *. 김서방 찾기
       */

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i<seoul.length; i++){
            answer += (seoul[i].equals("Kim"))? "김서방은 " + i + "에 있다" : ""; //.equals 사용법!
        }
        return answer;
    }
}
//

