/* 프로그래머스 Level 2 문제 풀이
   *.카펫
       Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 
       카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
      - 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
      - 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
      - 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.  
      */

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = brown/2-2;
        int b = yellow;
        answer[0] = (a + (int)(Math.sqrt(a*a-4*b)))/2 +2;
        answer[1] = (a - (int)(Math.sqrt(a*a-4*b)))/2 +2;    
        return answer;
    }
}

//다른 사람의 풀이



class Solution {
    public int[] solution(int brown, int red) {
        for(int i=1; i<=red; i++) {
            if(red%i==0 && (red/i+i)*2+4==brown) {
                return new int[] {red/i+2, i+2};
            }
        }
        return null;
    }
}