/* 프로그래머스 Level 1 문제 풀이
   1. 직사각형 별찍기
      제한사항 : n,m이 주어질때, 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태의 출력 하기 (n,m은 1000이하의 자연수) */

import java.util.Scanner; // Scanner로 문자 읽기,

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < b ; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
/*
테스트 1 〉	통과 (372.07ms, 58.7MB)
테스트 2 〉	통과 (456.11ms, 64.9MB)
테스트 3 〉	통과 (375.70ms, 62.7MB)
테스트 4 〉	통과 (397.83ms, 61.5MB)
테스트 5 〉	통과 (274.93ms, 73.5MB)
테스트 6 〉	통과 (654.05ms, 65.8MB)
테스트 7 〉	통과 (565.78ms, 69.6MB)
테스트 8 〉	통과 (573.27ms, 69.8MB)
테스트 9 〉	통과 (549.55ms, 84.4MB)
테스트 10 〉	통과 (491.14ms, 83.3MB)
테스트 11 〉	통과 (383.06ms, 75.2MB)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //StringTokenizer 로 받은 1 라인을 " "로 토큰으로 나눈다.        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < b ; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

/*
테스트 1 〉	통과 (146.72ms, 66MB)
테스트 2 〉	통과 (123.39ms, 60.1MB)
테스트 3 〉	통과 (172.19ms, 65.5MB)
테스트 4 〉	통과 (161.23ms, 58.6MB)
테스트 5 〉	통과 (168.60ms, 68.3MB)
테스트 6 〉	통과 (268.78ms, 62.9MB)
테스트 7 〉	통과 (211.30ms, 66MB)
테스트 8 〉	통과 (173.40ms, 70.8MB)
테스트 9 〉	통과 (249.24ms, 89.7MB)
테스트 10 〉	통과 (160.32ms, 68.6MB)
테스트 11 〉	통과 (168.97ms, 89MB)
Scanner 쓰는 것 보다 훨씬 빨라진다 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");       
        StringBuilder sb = new StringBuilder(); //StringBuilder로 출력값 써놓기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < b ; i++){
            for(int j = 0; j < a; j++){
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

/*
테스트 1 〉	통과 (450.96ms, 64.7MB)
테스트 2 〉	통과 (162.49ms, 63.7MB)
테스트 3 〉	통과 (163.67ms, 61.5MB)
테스트 4 〉	통과 (155.56ms, 59.1MB)
테스트 5 〉	통과 (219.98ms, 62.1MB)
테스트 6 〉	통과 (334.99ms, 60.3MB)
테스트 7 〉	통과 (245.25ms, 63.3MB)
테스트 8 〉	통과 (142.16ms, 60.3MB)
테스트 9 〉	통과 (134.94ms, 61.3MB)
테스트 10 〉	통과 (164.28ms, 65.1MB)
테스트 11 〉	통과 (191.86ms, 59.7MB)
바로 print 하는게 아니고, StringBuilder로 받아서 한번에 출력, 속도는 빨라지지 않았다..*/

