class Solution {
    public String solution(String s) {
        s = s.toUpperCase();
        String[] list = s.split("");
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.length; i++){
          if(list[i].equals(" ")) {
            count = 0;
            continue;
            }
          if(count%2 == 1) list[i] = list[i].toLowerCase();
          count++;
         }
        for(String i : list) sb.append(i);
        return sb.toString();
    }
}


/*
테스트 1 〉	통과 (0.16ms, 75.9MB)
테스트 2 〉	통과 (0.15ms, 74.3MB)
테스트 3 〉	통과 (0.15ms, 79.4MB)
테스트 4 〉	통과 (0.42ms, 70.6MB)
테스트 5 〉	통과 (0.24ms, 75.4MB)
테스트 6 〉	통과 (0.13ms, 74.1MB)
테스트 7 〉	통과 (0.17ms, 83.3MB)
테스트 8 〉	통과 (0.43ms, 72.5MB)
테스트 9 〉	통과 (0.21ms, 67.8MB)
테스트 10 〉	통과 (0.44ms, 69.7MB)
테스트 11 〉	통과 (0.64ms, 76MB)
테스트 12 〉	통과 (0.64ms, 77.7MB)
테스트 13 〉	통과 (0.23ms, 76.4MB)
테스트 14 〉	통과 (0.15ms, 78.6MB)
테스트 15 〉	통과 (0.21ms, 76.3MB)
테스트 16 〉	통과 (0.37ms, 74.9MB)
*/









class Solution {
    public String solution(String s) {
        String s1= s.toUpperCase();
        String s2= s.toLowerCase();        
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for(int i = 0;  i < s.length(); i++){
          if(s.charAt(i) == ' '){
              sb.append(" ");
            index = 0;
            continue;
           }
          if(index%2 == 0) {
             sb.append(s1.charAt(i));
             index++;
             }
           else {
             sb.append(s2.charAt(i));
             index++;
             }
}

        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.08ms, 74.4MB)
테스트 2 〉	통과 (0.06ms, 71.6MB)
테스트 3 〉	통과 (0.03ms, 75.5MB)
테스트 4 〉	통과 (0.13ms, 81.7MB)
테스트 5 〉	통과 (0.08ms, 67.7MB)
테스트 6 〉	통과 (0.05ms, 70.7MB)
테스트 7 〉	통과 (0.05ms, 74.9MB)
테스트 8 〉	통과 (0.13ms, 72MB)
테스트 9 〉	통과 (0.04ms, 76.7MB)
테스트 10 〉	통과 (0.09ms, 74.5MB)
테스트 11 〉	통과 (0.09ms, 78.1MB)
테스트 12 〉	통과 (0.09ms, 71.9MB)
테스트 13 〉	통과 (0.09ms, 75.7MB)
테스트 14 〉	통과 (0.05ms, 78.7MB)
테스트 15 〉	통과 (0.07ms, 81.1MB)
테스트 16 〉	통과 (0.07ms, 75.3MB)

*/



import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i = 0; i < d.length ; i++) {
            budget -= d[i];
            if(budget < 0 )break;
            answer++;
        
    }
        return answer;
}
}



/*
테스트 1 〉	통과 (0.32ms, 61.3MB)
테스트 2 〉	통과 (0.35ms, 69.9MB)
테스트 3 〉	통과 (0.33ms, 71MB)
테스트 4 〉	통과 (0.37ms, 60.4MB)
테스트 5 〉	통과 (0.31ms, 69.6MB)
테스트 6 〉	통과 (0.50ms, 71.9MB)
테스트 7 〉	통과 (0.38ms, 69.3MB)
테스트 8 〉	통과 (0.39ms, 74.6MB)
테스트 9 〉	통과 (0.39ms, 71.5MB)
테스트 10 〉	통과 (0.51ms, 72.7MB)
테스트 11 〉	통과 (0.60ms, 74.2MB)
테스트 12 〉	통과 (0.62ms, 67.5MB)
테스트 13 〉	통과 (0.35ms, 71.4MB)
테스트 14 〉	통과 (0.47ms, 71MB)
테스트 15 〉	통과 (0.36ms, 71.9MB)
테스트 16 〉	통과 (0.38ms, 71.4MB)
테스트 17 〉	통과 (0.37ms, 60.1MB)
테스트 18 〉	통과 (0.54ms, 69.7MB)
테스트 19 〉	통과 (0.40ms, 60.7MB)
테스트 20 〉	통과 (0.37ms, 73.6MB)
테스트 21 〉	통과 (0.32ms, 68.2MB)
테스트 22 〉	통과 (0.33ms, 60.7MB)
테스트 23 〉	통과 (0.35ms, 68.7MB)
*/











부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.




import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;  
        int i = 0;
        while(i<d.length){
          if((budget - d[i]) > 0) {
            budget -= d[i];
            i++;
            answer++;
            }
          else return answer;
        }
    }
}
/*
테스트 1 〉	통과 (0.47ms, 78.1MB)
테스트 2 〉	통과 (0.36ms, 71.4MB)
테스트 3 〉	통과 (0.34ms, 77.7MB)
테스트 4 〉	통과 (0.34ms, 78.9MB)
테스트 5 〉	통과 (0.36ms, 83.1MB)
테스트 6 〉	통과 (0.31ms, 75.6MB)
테스트 7 〉	통과 (0.38ms, 73.3MB)
테스트 8 〉	통과 (0.39ms, 79.5MB)
테스트 9 〉	통과 (0.38ms, 75.9MB)
테스트 10 〉	통과 (0.45ms, 74.3MB)
테스트 11 〉	통과 (0.36ms, 66.7MB)
테스트 12 〉	통과 (0.40ms, 75.2MB)
테스트 13 〉	통과 (0.51ms, 89.4MB)
테스트 14 〉	통과 (0.38ms, 78.5MB)
테스트 15 〉	통과 (0.56ms, 77.9MB)
테스트 16 〉	통과 (0.41ms, 79.6MB)
테스트 17 〉	통과 (0.35ms, 81MB)
테스트 18 〉	통과 (0.36ms, 77.3MB)
테스트 19 〉	통과 (0.41ms, 75MB)
테스트 20 〉	통과 (0.40ms, 68.2MB)
테스트 21 〉	통과 (0.32ms, 83.1MB)
테스트 22 〉	통과 (0.32ms, 75.3MB)
테스트 23 〉	통과 (0.31ms, 73.7MB)
*/
