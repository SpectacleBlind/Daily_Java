/* 프로그래머스 Level 1 문제 풀이
   *. 점프와 순간이동
       */

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
        if(n%2 == 0){
           n /=2;     
        }
        else {
            n--;
            ans++;
        }
        }
        return ans;
    }
}