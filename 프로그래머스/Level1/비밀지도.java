/* 프로그래머스 Level 1 문제 풀이
   *. [1차] 비밀지도


       */

class Solution {
    static public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {          
            String trans = Integer.toBinaryString(arr1[i] | arr2[i]);  
            trans = String.format("%" + n + "s", trans);
            trans = trans.replaceAll("1", "#");
            trans = trans.replaceAll("0", " ");
            answer[i] = trans;
        }

        return answer;
    }
}


/*
테스트 1 〉	통과 (7.73ms, 76.2MB)
테스트 2 〉	통과 (8.19ms, 80.9MB)
테스트 3 〉	통과 (10.07ms, 73.8MB)
테스트 4 〉	통과 (8.23ms, 80MB)
테스트 5 〉	통과 (9.00ms, 74MB)
테스트 6 〉	통과 (8.25ms, 77.7MB)
테스트 7 〉	통과 (6.88ms, 77.7MB)
테스트 8 〉	통과 (6.63ms, 77.4MB)
*/


// 다른 사람의 풀이


class Solution {
    public String makeSharp(int n, int m) { //재귀함수로 만든 것
        if(n == 0) {
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
        }
    }
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (1.90ms, 75.3MB)
테스트 2 〉	통과 (2.13ms, 77.1MB)
테스트 3 〉	통과 (2.62ms, 79.3MB)
테스트 4 〉	통과 (1.87ms, 75.3MB)
테스트 5 〉	통과 (1.75ms, 75.2MB)
테스트 6 〉	통과 (1.98ms, 74.5MB)
테스트 7 〉	통과 (2.05ms, 79MB)
테스트 8 〉	통과 (2.56ms, 75.2MB)
*/
