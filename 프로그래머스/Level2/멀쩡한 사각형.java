/* 프로그래머스 Level 2 문제 풀이
   *.멀쩡한 사각형
   * 결국 Width, Heigth 두개의 최대공약수로 푸는 문제
       */


class Solution {
    public long solution(int w, int h) {   
        long answer = 0;
        Long width = Long.valueOf(w);
        Long height = Long.valueOf(h);
        
        answer = width*height - (width + height - getGreatestNum(width, height));
        
        return answer;
    }
    
    long getGreatestNum(long width, long height) {
        long small = height;
        long big = width;
        if (width < height) {
            big = height;
            small = width;
        }
        
        long temp = 0;
        while (small > 0) {
            temp = big % small;
            
            big = small;
            small = temp;
        }
        
        return (big);
    }
}

// 다른 사람의 풀이

class Solution {
    public long solution(int w,int h) {
        long min=Math.min(w, h);
        long max=Math.max(w, h);
        long remain=1;
        while(remain>0) {
            remain=max%min;
            max=min;
            min=remain;
        }
        long answer = (long)w*(long)h-max*(w/max + h/max -1);
        return answer;
    }
}