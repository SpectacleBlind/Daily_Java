/* 프로그래머스 Level 1 문제 풀이
   *. 2016
       */

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int date = 0;
        
        for(int i = 0; i < a-1; i++){
            date += month[i];
        }
        date += b;
        
        switch(date%7){
            case 6 :
                answer = "WED";
                break;
                case 0 :
                answer = "THU";
                break;
                case 1 :
                answer = "FRI";
                break;
                case 2 :
                answer = "SAT";
                break;
                case 3 :
                answer = "SUN";
                break;
                case 4 :
                answer = "MON";
                break;
                case 5 :
                answer = "TUE";
                break;
        }
        
        return answer;
    }
}

프로그래머스 Level 1 -