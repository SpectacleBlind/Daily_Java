/* 프로그래머스 Level 2 문제 풀이
   *. 2개 이하로 다른 비트
   * */
   

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i]%2 == 0) answer[i] = numbers[i] + 1;    //짝수면 마지막 자리가 0이니 단순히 1 더하고 끝
            
            else {
                StringBuilder sb = new StringBuilder();
                String binary = Long.toBinaryString(numbers[i]); //2진법 String으로 만들기
                if(!binary.contains("0")){                       //0이 없다면 - 전부 1로 이루어진 문자열
                    sb.append("10");                             //맨 앞놈을 10으로 치환
                    sb.append(binary.substring(1));              //뒤로 다 붙여도 된다
                }
                else{
                    int zero = binary.lastIndexOf("0");          //0이 있는 제일 작은 자릿수
                    int one = binary.indexOf("1" , zero);        //0 자릿수에서 가장 가까운 1 자리
                    sb.append(binary, 0, zero).append("1").append("0").append(binary.substring(one+1));
                                                                 //0 직전까지 붙이고, 1로 치환, 바로 뒤 1을 0으로, 뒤로 쭉 붙이기
                }
                answer[i] = Long.parseLong(sb.toString(),2);     //10진법으로 다시 변환
            }            
        }
        return answer;
    }
}