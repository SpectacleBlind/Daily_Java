/* 프로그래머스 Level 2 문제 풀이
   *. 최댓값과 최솟값
      str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
      s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
      */

import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) throws IOException{
        StringTokenizer st = new StringTokenizer(s);
        
        int j = 0;
        int[] arr = new int[st.countTokens()];
        while(st.hasMoreTokens()){
            arr[j] = Integer.parseInt(st.nextToken());
            j++;
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < j ; i++){
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }
        String answer = min + " " + max;
        return answer;
    }
}
//다른사람의 풀이

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" "); //String Split 활용
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]); //String Array 쓰면, 각각 변환할때 Integer.parseInt 쓰면 됨. 언제 쓰냐의 차이이지 같은 원리
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }
