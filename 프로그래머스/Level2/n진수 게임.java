/* 프로그래머스 Level 2 문제 풀이
   *. [3차] n진수 게임

       */

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= t * m; i++) 
            sb.append(Integer.toString(i, n));

        StringBuilder ans = new StringBuilder();
        for (int i = p - 1; ans.length() < t; i += m) 
            ans.append(sb.charAt(i));

        return ans.toString().toUpperCase();
    }
}

// 다른 사람의 풀이

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 게임
        int i = 1;
        sb.append(0);
        while(sb.length()<m*t) {
            sb.append(notation(i++,n));
        }
        // 튜브가 말해야 하는 숫자
        for(int j=p-1; j<m*(t-1)+p; j+=m) {
            answer += sb.charAt(j);
        }
        return answer;
    }
    
    // 진법 변환
    String notation(int num, int n) {
        String nStr = "";
        while(num!=0) {
            if(num%n<10)
                nStr = num%n + nStr;
            else // 10진수 이상 알파벳 저장
                nStr = String.valueOf((char)(num%n + 55)) + nStr;
            num /= n;
        }
        return nStr;
    }
}