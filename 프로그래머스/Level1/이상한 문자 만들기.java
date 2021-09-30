/* 프로그래머스 Level 1 문제 풀이
   15. 이상한 문자 만들기
       각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
       
      - 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
      - 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
       */


class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                index = 0;
            }
            else{
                arr[i] = index%2 == 0 ? arr[i].toUpperCase() : arr[i].toLowerCase();
                index++;
         }
        answer += arr[i];
        }
        return answer;
    }
}










class Solution {
    public String solution(String s) {
        s = s.toLowerCase(); //전체 소문자 
        String answer = "";
        String[] temp = s.split(""); //Arrays로 넣을때 한칸씩 다 넣는 것
        int count = 0;        
        for(int i = 0; i<temp.length;i++){
            if(count%2 == 0) {
                temp[i] = temp[i].toUpperCase();
                }
            count++;
            if(temp[i].equals(" ")) count = 0; //Arrays 안에서 값 비교 하려면 .equals() 로 해야한다!
         answer += temp[i];
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (1.33ms, 75.3MB)
테스트 2 〉	통과 (1.33ms, 78.5MB)
테스트 3 〉	통과 (1.28ms, 72.5MB)
테스트 4 〉	통과 (1.88ms, 72.1MB)
테스트 5 〉	통과 (1.51ms, 71.9MB)
테스트 6 〉	통과 (1.37ms, 78.7MB)
테스트 7 〉	통과 (1.20ms, 77.8MB)
테스트 8 〉	통과 (1.81ms, 76.1MB)
테스트 9 〉	통과 (1.42ms, 73.7MB)
테스트 10 〉	통과 (2.00ms, 77.8MB)
테스트 11 〉	통과 (1.97ms, 73.3MB)
테스트 12 〉	통과 (1.66ms, 77.7MB)
테스트 13 〉	통과 (1.28ms, 83.8MB)
테스트 14 〉	통과 (1.46ms, 77.3MB)
테스트 15 〉	통과 (1.41ms, 79.2MB)
테스트 16 〉	통과 (1.75ms, 73.3MB)
*/