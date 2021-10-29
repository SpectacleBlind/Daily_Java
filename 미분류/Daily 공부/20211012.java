//StringBuilder를 사용하는것이, 그때 그때 넣는것 보다 훨씬 빠르다.

class Solution {
    public String solution(String s) {
        s = s.toLowerCase(); 
        String answer = "";
        String[] temp = s.split("");
        int count = 0;        
        for(int i = 0; i<temp.length;i++){
            if(count%2 == 0) {
                temp[i] = temp[i].toUpperCase();
                }
            count++;
            if(temp[i].equals(" ")) count = 0;
         answer += temp[i];
        }
        return answer;
    }
}
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




class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] list = s.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0; i<list.length ; i++){
          if(list[i].equals(" ")) {
            count = 0; 
            continue;
            }
          if(count%2 == 0) list[i] = list[i].toUpperCase(); 
            count++;
         }
        for(String i : list) sb.append(i);
        return sb.toString();
    }
}
테스트 1 〉	통과 (0.18ms, 73.3MB)
테스트 2 〉	통과 (0.14ms, 83.1MB)
테스트 3 〉	통과 (0.14ms, 79.5MB)
테스트 4 〉	통과 (0.49ms, 68.7MB)
테스트 5 〉	통과 (0.39ms, 74.6MB)
테스트 6 〉	통과 (0.21ms, 66.6MB)
테스트 7 〉	통과 (0.15ms, 76.6MB)
테스트 8 〉	통과 (0.49ms, 70.4MB)
테스트 9 〉	통과 (0.23ms, 73.1MB)
테스트 10 〉	통과 (0.76ms, 76.3MB)
테스트 11 〉	통과 (0.50ms, 76.4MB)
테스트 12 〉	통과 (0.45ms, 78.6MB)
테스트 13 〉	통과 (0.37ms, 77.6MB)
테스트 14 〉	통과 (0.15ms, 72.1MB)
테스트 15 〉	통과 (0.34ms, 71.1MB)
테스트 16 〉	통과 (0.39ms, 76.4MB)






class Solution {
    public String solution(String s) {
        s = s.toUpperCase();
        String[] list = s.split("");
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.length; i++){
          if(list[i].equals(" ")) {
            count = 0;
            sb.append(list[i]);
            continue;
            }
          if(count%2 == 1) list[i] = list[i].toLowerCase();
          count++;
          sb.append(list[i]);
         }
        return sb.toString();
    }
}


테스트 1 〉	통과 (0.17ms, 77.1MB)
테스트 2 〉	통과 (0.13ms, 74.2MB)
테스트 3 〉	통과 (0.20ms, 78.8MB)
테스트 4 〉	통과 (0.76ms, 76MB)
테스트 5 〉	통과 (0.37ms, 71.9MB)
테스트 6 〉	통과 (0.12ms, 76MB)
테스트 7 〉	통과 (0.22ms, 74.8MB)
테스트 8 〉	통과 (0.54ms, 78.5MB)
테스트 9 〉	통과 (0.19ms, 73.4MB)
테스트 10 〉	통과 (0.47ms, 77.3MB)
테스트 11 〉	통과 (0.46ms, 75.1MB)
테스트 12 〉	통과 (0.60ms, 78.7MB)
테스트 13 〉	통과 (0.24ms, 76.5MB)
테스트 14 〉	통과 (0.13ms, 71.8MB)
테스트 15 〉	통과 (0.20ms, 78.1MB)
테스트 16 〉	통과 (0.38ms, 82.5MB)




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
