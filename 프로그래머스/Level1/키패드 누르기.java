/* 프로그래머스 Level 1 문제 풀이
   *. [카카오 인턴] 키패드 누르기
       순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 
       나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 
       왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
       
       */
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
              answer += "L"; 
              left = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
              answer += "R"; 
              right = numbers[i];
            }
            else{
                if(numbers[i] == 0) numbers[i] = 11; 
                int ldist = Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;
                int rdist = Math.abs(right - numbers[i]) / 3 + Math.abs(right - numbers[i]) % 3;
                
                if(ldist == rdist){
                    if(hand.equals("left")){
                        answer += "L";
                        left = numbers[i];                  
                    }else{
                        answer += "R";
                        right = numbers[i];                        
                    }            
                }
                else if(ldist < rdist){
                    answer += "L";
                    left = numbers[i];                         
                }else if(ldist > rdist){
                    answer += "R";
                    right = numbers[i];                        
                }
            }
                
        }
          return answer;
}}      

/*
else {
    numbers[i] = (numbers[i] == 0) ? 11 : numbers[i];
    if(left == 10 && right == 12){
        answer += (hand.equals("right")) ? 'R' : 'L';
        right = (hand.equals("right")) ? numbers[i] : right;    
        left = (hand.equals("left")) ? numbers[i] : left;            
    }
    int leftx = left%3;
    int lefty = 3 - left/3;
    int rightx = right%3;
    int righty = 3 - right/3;
    int coorx = numbers[i]%3;
    int coory = 3 - numbers[i]/3;
    int leftcoor = Math.abs(coorx - leftx) + Math.abs(coory - lefty);
    int rightcoor = Math.abs(coorx - rightx) + Math.abs(coory - righty);      
    if (rightcoor > leftcoor){
         answer += "L";
         left = numbers[i];     
        }
    else if (rightcoor < leftcoor){
         answer += "R";
         right = numbers[i];     
        }           
    else { 
         if(hand.equals("right")) {
         answer += "R";
         right = numbers[i];}
          else {
         answer += "L"; 
         left = numbers[i]; 
    }   }               

}
}
마지막 else 모듈을 위와같이 풀어보려고 했는데, 실패했다.. 확인이 필요하다. 
*/

// 다른사람의 풀이 - 훨씬 빠르다..

import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int left = 10;
        int right = 12;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 ||numbers[i]==4 || numbers[i]==7) {
                sb.append('L');
                left = numbers[i];
            }else if(numbers[i]==3 ||numbers[i]==6 || numbers[i]==9){ 
                sb.append('R');
                right = numbers[i];
            }else{
                if(numbers[i] == 0) numbers[i] = 11; 
                int ldist = Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;
                int rdist = Math.abs(right - numbers[i]) / 3 + Math.abs(right - numbers[i]) % 3;
                
                if(ldist == rdist){
                    if(hand.equals("left")){
                        sb.append('L');
                        left = numbers[i];                  
                    }else{
                        sb.append('R');
                        right = numbers[i];                        
                    }            
                }
                else if(ldist < rdist){
                    sb.append('L');
                    left = numbers[i];                         
                }else if(ldist > rdist){
                    sb.append('R');
                    right = numbers[i];                        
                }
            }
                
        }
        
        return sb.toString();
    }
}