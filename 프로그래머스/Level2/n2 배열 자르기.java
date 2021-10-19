/* 프로그래머스 Level 2 문제 풀이
   *. n^2 배열 자르기
   * */
   

class Solution {
    public int[] solution(int n, long left, long right) {
        long len = right - left + 1;
        int[] answer = new int [(int)len];
        //StringBuilder sb = new StringBuilder ();
        long index = 0;
        int count = 0;
        
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(index >= left && index <= right){
                    if(i>=j) {
                        answer[count] = (i+1);
                        count++;
                    }
                    else {
                        answer[count] = (j+1);
                        count++;
                    }
                if(index > right) break;
                }
                index++; // 0 1 2 4 5
        }            
            index++; // 3
        }
        
        /*
        String ans = sb.toString();
        int[] answer = new int [ans.length()];
        for (int i = 0 ; i < ans.length() ; i++){
            answer[i] = ans.charAt(i) - '0';
        }
        */
        return answer;
    }
}

//이렇게 하니 에러가 난다...


//바꾼 답안  long과 int 사이의 조절이 필요하다
class Solution {
    public int[] solution(int n, long left, long right) {
        long len = right - left + 1;
        int[] answer = new int [(int)len];
        
        int count = 0;
        for(long i = left ; i < right+1 ; i++){
           answer[count] = (int)((Math.max(i/n,i%n))+1); //행 열의 인덱스 중, Max 값이 각 행의 숫자가 되는 형식!
           count++;
           }
                    
        return answer;
    }
}