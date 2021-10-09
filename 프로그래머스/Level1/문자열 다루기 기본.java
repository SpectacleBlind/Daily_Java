/* 프로그래머스 Level 1 문제 풀이
   *. 문자열 다루기 기본
       */

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        try {
         int test = Integer.parseInt(s);
            answer = true;
         answer = (s.length() == 4 || s.length() == 6) ? true : false;
         
        }
        catch(NumberFormatException test){ //try catch 로 exception 잡기
         answer = false;
        }
        finally{
        return answer;
    }
    }
}