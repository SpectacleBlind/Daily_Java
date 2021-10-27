import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");       
        StringBuilder sb = new StringBuilder();
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

테스트 1 〉	통과 (450.96ms, 64.7MB)
테스트 2 〉	통과 (162.49ms, 63.7MB)
테스트 3 〉	통과 (163.67ms, 61.5MB)
테스트 4 〉	통과 (155.56ms, 59.1MB)
테스트 5 〉	통과 (116.89ms, 62.8MB)
테스트 6 〉	통과 (334.99ms, 60.3MB)
테스트 7 〉	통과 (245.25ms, 63.3MB)
테스트 8 〉	통과 (142.16ms, 60.3MB)
테스트 9 〉	통과 (134.94ms, 61.3MB)
테스트 10 〉	통과 (164.28ms, 65.1MB)
테스트 11 〉	통과 (191.86ms, 59.7MB)




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int j = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for(int i = 0; i < a ; i++)  sb.append("*");
        while(j<b){
        System.out.println(sb);
        j++;
    }
}
}

테스트 1 〉	통과 (132.16ms, 62MB)
테스트 2 〉	통과 (113.16ms, 57.2MB)
테스트 3 〉	통과 (128.31ms, 60.5MB)
테스트 4 〉	통과 (127.62ms, 66.2MB)
테스트 5 〉	통과 (115.27ms, 60.4MB)
테스트 6 〉	통과 (113.19ms, 63.7MB)
테스트 7 〉	통과 (141.82ms, 61.5MB)
테스트 8 〉	통과 (117.53ms, 64.3MB)
테스트 9 〉	통과 (118.01ms, 62.5MB)
테스트 10 〉	통과 (133.52ms, 64.9MB)
테스트 11 〉	통과 (141.57ms, 64.9MB)


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0 ; i < a ; i++) sb.append("*");
        for(int j = 0; j < b ; j++) System.out.println(sb);
    }
}


테스트 1 〉	통과 (126.02ms, 70.8MB)
테스트 2 〉	통과 (174.41ms, 66.4MB)
테스트 3 〉	통과 (131.69ms, 69.7MB)
테스트 4 〉	통과 (129.54ms, 66.8MB)
테스트 5 〉	통과 (156.21ms, 67MB)
테스트 6 〉	통과 (134.97ms, 64.9MB)
테스트 7 〉	통과 (152.71ms, 69.6MB)
테스트 8 〉	통과 (136.66ms, 62.9MB)
테스트 9 〉	통과 (140.31ms, 71.2MB)
테스트 10 〉	통과 (207.05ms, 64MB)
테스트 11 〉	통과 (144.01ms, 66.2MB)


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(i<a){
          sb.append("*");
            i++;
        } 
        i=0;
        while(i<b){ System.out.println(sb);
                   i++;
                  }
    }
}

테스트 1 〉	통과 (143.89ms, 65.3MB)
테스트 2 〉	통과 (132.05ms, 69.4MB)
테스트 3 〉	통과 (158.67ms, 65.7MB)
테스트 4 〉	통과 (141.66ms, 67.6MB)
테스트 5 〉	통과 (164.54ms, 65.7MB)
테스트 6 〉	통과 (148.54ms, 73MB)
테스트 7 〉	통과 (139.58ms, 70.1MB)
테스트 8 〉	통과 (133.39ms, 65.6MB)
테스트 9 〉	통과 (136.22ms, 72.5MB)
테스트 10 〉	통과 (138.79ms, 69.4MB)
테스트 11 〉	통과 (152.55ms, 65.4MB)




class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        for(int i = 0; i<n;i++){
            answer [i] = (long)x*(i+1);
        }
        return answer;
    }
}








함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        for(int i = 0; i < n ; i++){
        answer [i] = x*(i+1);
        }
        return answer;
    }
}





class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++ ){
           for(int j = 0; j < arr1[0].length; j++ ){
            answer[i][j] = arr1[i][j]+arr2[i][j];
        } 
        }
        return answer;
    }
}



class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
       for(int i = 0; i < arr1.length; i++){
         for(int j = 0; j < arr1[0].length; j++){
           arr1[i][j] += arr2[i][j];
    }
} 
  return arr1;
}}









class Solution {
public String solution(String phone_number) { 
    String answer = ""; 
    for(int i = 0; i < phone_number.length(); i++){
        if(i < phone_number.length()-4){ 
            answer += "*"; 
        }
        else{ 
         answer += phone_number.charAt(i); 
        }
    } 
    return answer; 
} 
}

테스트 1 〉	통과 (13.15ms, 73.4MB)
테스트 2 〉	통과 (11.63ms, 72.4MB)
테스트 3 〉	통과 (12.86ms, 61.3MB)
테스트 4 〉	통과 (13.14ms, 60.1MB)
테스트 5 〉	통과 (15.22ms, 59.8MB)
테스트 6 〉	통과 (12.52ms, 74.9MB)
테스트 7 〉	통과 (24.75ms, 71.2MB)
테스트 8 〉	통과 (13.78ms, 75.6MB)
테스트 9 〉	통과 (19.59ms, 72.4MB)
테스트 10 〉	통과 (16.73ms, 59.2MB)
테스트 11 〉	통과 (12.08ms, 61.3MB)
테스트 12 〉	통과 (12.59ms, 73.9MB)
테스트 13 〉	통과 (10.46ms, 62.4MB)





class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phone_number.length()-4; i++) sb.append("*");
        sb.append(phone_number.substring(phone_number.length()-4);
        return sb.toString();
    }
}

테스트 1 〉	통과 (0.04ms, 74.3MB)
테스트 2 〉	통과 (0.03ms, 83.7MB)
테스트 3 〉	통과 (0.05ms, 73.5MB)
테스트 4 〉	통과 (0.03ms, 71.7MB)
테스트 5 〉	통과 (0.06ms, 75.8MB)
테스트 6 〉	통과 (0.03ms, 71.8MB)
테스트 7 〉	통과 (0.03ms, 73.5MB)
테스트 8 〉	통과 (0.03ms, 71.7MB)
테스트 9 〉	통과 (0.02ms, 74.6MB)
테스트 10 〉	통과 (0.02ms, 77.2MB)
테스트 11 〉	통과 (0.02ms, 73MB)
테스트 12 〉	통과 (0.03ms, 75.3MB)
테스트 13 〉	통과 (0.02ms, 72.7MB)













class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int number = x;
        
        while (number > 0){
            sum += number%10;
            number = number/10;
        }
        
        if(x%sum == 0){
        answer = true;
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.03ms, 70.3MB)
테스트 2 〉	통과 (0.02ms, 59.5MB)
테스트 3 〉	통과 (0.02ms, 73MB)
테스트 4 〉	통과 (0.03ms, 58.9MB)
테스트 5 〉	통과 (0.02ms, 73.5MB)
테스트 6 〉	통과 (0.04ms, 80.7MB)
테스트 7 〉	통과 (0.03ms, 72.1MB)
테스트 8 〉	통과 (0.02ms, 74.4MB)
테스트 9 〉	통과 (0.02ms, 59.7MB)
테스트 10 〉	통과 (0.02ms, 71.7MB)
테스트 11 〉	통과 (0.03ms, 69.4MB)
테스트 12 〉	통과 (0.03ms, 69.9MB)
테스트 13 〉	통과 (0.02ms, 67.4MB)
테스트 14 〉	통과 (0.02ms, 72.1MB)
테스트 15 〉	통과 (0.03ms, 73.2MB)
테스트 16 〉	통과 (0.03ms, 76.6MB)
테스트 17 〉	통과 (0.02ms, 72.2MB)




class Solution {
    public boolean solution(int x) {
       int num = x;
       int y= 0;        
       while (num>=10){
         y += num%10;
        num /=10;
        } 
       y+=num;

        boolean answer = (x%y==0) ? true : false;
        return answer;
    }
}

테스트 1 〉	통과 (0.01ms, 73.8MB)
테스트 2 〉	통과 (0.02ms, 76.4MB)
테스트 3 〉	통과 (0.02ms, 71.8MB)
테스트 4 〉	통과 (0.03ms, 73.2MB)
테스트 5 〉	통과 (0.02ms, 77.4MB)
테스트 6 〉	통과 (0.02ms, 79.6MB)
테스트 7 〉	통과 (0.02ms, 76.5MB)
테스트 8 〉	통과 (0.02ms, 74.3MB)
테스트 9 〉	통과 (0.02ms, 75MB)
테스트 10 〉	통과 (0.02ms, 77.6MB)
테스트 11 〉	통과 (0.02ms, 81.9MB)
테스트 12 〉	통과 (0.02ms, 77MB)
테스트 13 〉	통과 (0.02ms, 74.8MB)
테스트 14 〉	통과 (0.01ms, 74.3MB)
테스트 15 〉	통과 (0.02ms, 77.9MB)
테스트 16 〉	통과 (0.03ms, 76.4MB)
테스트 17 〉	통과 (0.01ms, 78.1MB)





class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length ; i++){
            answer += arr[i]; 
        }
        answer = answer/arr.length;
        return answer;
    }
}
테스트 1 〉	통과 (0.03ms, 61.1MB)
테스트 2 〉	통과 (0.02ms, 60.4MB)
테스트 3 〉	통과 (0.01ms, 70.5MB)
테스트 4 〉	통과 (0.03ms, 72.6MB)
테스트 5 〉	통과 (0.01ms, 69.7MB)
테스트 6 〉	통과 (0.03ms, 70.7MB)
테스트 7 〉	통과 (0.03ms, 71.7MB)
테스트 8 〉	통과 (0.02ms, 67.1MB)
테스트 9 〉	통과 (0.02ms, 70.4MB)
테스트 10 〉	통과 (0.02ms, 72.7MB)
테스트 11 〉	통과 (0.02ms, 74.9MB)
테스트 12 〉	통과 (0.01ms, 59.7MB)
테스트 13 〉	통과 (0.01ms, 58.7MB)
테스트 14 〉	통과 (0.02ms, 71.9MB)
테스트 15 〉	통과 (0.03ms, 70.6MB)
테스트 16 〉	통과 (0.02ms, 72.2MB)



class Solution {
    public double solution(int[] arr) {
        int ans = 0;
        for(int i : arr) ans += i; 
        double answer = (double)ans / arr.length ;
        return answer;
    }
}


테스트 1 〉	통과 (0.02ms, 77.5MB)
테스트 2 〉	통과 (0.02ms, 71.8MB)
테스트 3 〉	통과 (0.02ms, 76.5MB)
테스트 4 〉	통과 (0.02ms, 80.4MB)
테스트 5 〉	통과 (0.01ms, 72.4MB)
테스트 6 〉	통과 (0.01ms, 82.4MB)
테스트 7 〉	통과 (0.02ms, 73.7MB)
테스트 8 〉	통과 (0.03ms, 77MB)
테스트 9 〉	통과 (0.02ms, 74.3MB)
테스트 10 〉	통과 (0.02ms, 73.3MB)
테스트 11 〉	통과 (0.01ms, 80MB)
테스트 12 〉	통과 (0.03ms, 77MB)
테스트 13 〉	통과 (0.02ms, 73.5MB)
테스트 14 〉	통과 (0.02ms, 66.7MB)
테스트 15 〉	통과 (0.02ms, 73MB)
테스트 16 〉	통과 (0.04ms, 80.9MB)


















class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (num != 1){
            if(num%2 == 1) {
                num = num*3+1;
                          }
            else{
                  num = num/2;
            }
            answer++;
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}


테스트 1 〉	통과 (0.03ms, 69MB)
테스트 2 〉	통과 (0.02ms, 68.6MB)
테스트 3 〉	통과 (0.02ms, 70.8MB)
테스트 4 〉	통과 (0.02ms, 72.2MB)
테스트 5 〉	통과 (0.03ms, 60.4MB)
테스트 6 〉	통과 (0.03ms, 61.8MB)
테스트 7 〉	통과 (0.03ms, 69.4MB)
테스트 8 〉	통과 (0.02ms, 59.2MB)
테스트 9 〉	통과 (0.03ms, 68.8MB)
테스트 10 〉	통과 (0.03ms, 67.1MB)
테스트 11 〉	통과 (0.03ms, 69.6MB)
테스트 12 〉	통과 (0.01ms, 71.5MB)
테스트 13 〉	통과 (0.02ms, 71.3MB)
테스트 14 〉	통과 (0.02ms, 66.7MB)
테스트 15 〉	통과 (0.03ms, 69.8MB)
테스트 16 〉	통과 (0.02ms, 71.1MB)









class Solution {
    public int solution(int num) {
        int answer = 0;
        while (num != 1){
        if(num%2 == 1) num = num*3+1;
        else num /= 2;
         answer++;
        if(answer == 500) return -1;
}
        return answer;
    }
}




테스트 1 〉	통과 (0.02ms, 75.1MB)
테스트 2 〉	통과 (0.02ms, 74.5MB)
테스트 3 〉	통과 (0.03ms, 70.6MB)
테스트 4 〉	통과 (0.01ms, 77.9MB)
테스트 5 〉	통과 (0.02ms, 78.6MB)
테스트 6 〉	통과 (0.02ms, 75.8MB)
테스트 7 〉	통과 (0.04ms, 84.2MB)
테스트 8 〉	통과 (0.02ms, 74.6MB)
테스트 9 〉	통과 (0.01ms, 75.9MB)
테스트 10 〉	통과 (0.03ms, 80MB)
테스트 11 〉	통과 (0.04ms, 78.3MB)
테스트 12 〉	통과 (0.01ms, 76.5MB)
테스트 13 〉	통과 (0.01ms, 72.3MB)
테스트 14 〉	통과 (0.02ms, 81.7MB)
테스트 15 〉	통과 (0.02ms, 77.4MB)
테스트 16 〉	통과 (0.02ms, 71.2MB)




class Solution {
    public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int big,small;
      if(n>m){
          big = n; small = m;
      }else{
          big = m; small = n;
      }
      answer[0] = gcd(big,small);
      answer[1] = big*small/answer[0];
      
      return answer;
  }
  public int gcd(int a,int b){
      if(a % b == 0)
          return b;
      return gcd(b,a%b);
  }
}


테스트 1 〉	통과 (0.03ms, 70.3MB)
테스트 2 〉	통과 (0.01ms, 71.6MB)
테스트 3 〉	통과 (0.02ms, 69.7MB)
테스트 4 〉	통과 (0.03ms, 60MB)
테스트 5 〉	통과 (0.02ms, 58.7MB)
테스트 6 〉	통과 (0.04ms, 69.5MB)
테스트 7 〉	통과 (0.02ms, 73MB)
테스트 8 〉	통과 (0.02ms, 68.1MB)
테스트 9 〉	통과 (0.02ms, 58.3MB)
테스트 10 〉	통과 (0.02ms, 68MB)
테스트 11 〉	통과 (0.02ms, 71.9MB)
테스트 12 〉	통과 (0.03ms, 74.5MB)
테스트 13 〉	통과 (0.03ms, 58.9MB)
테스트 14 〉	통과 (0.02ms, 70.8MB)
테스트 15 〉	통과 (0.02ms, 70.6MB)
테스트 16 〉	통과 (0.02ms, 59.5MB)















class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
       if(n>m){       
       answer[0] = gcd(n,m);
       answer[1] = n*m / answer[0];
}
       else{       
       answer[0] = gcd(m,n);
       answer[1] = n*m / answer[0];
}
        return answer;
    }

public int gcd (int a, int b) {
      if(a%b == 0) return b;
      return gcd(b, a%b);
}
}






테스트 1 〉	통과 (0.02ms, 75.3MB)
테스트 2 〉	통과 (0.02ms, 72.5MB)
테스트 3 〉	통과 (0.01ms, 75MB)
테스트 4 〉	통과 (0.02ms, 75.6MB)
테스트 5 〉	통과 (0.02ms, 74.8MB)
테스트 6 〉	통과 (0.01ms, 76.9MB)
테스트 7 〉	통과 (0.02ms, 76MB)
테스트 8 〉	통과 (0.02ms, 75.4MB)
테스트 9 〉	통과 (0.02ms, 75MB)
테스트 10 〉	통과 (0.01ms, 76.4MB)
테스트 11 〉	통과 (0.02ms, 74.3MB)
테스트 12 〉	통과 (0.02ms, 85.3MB)
테스트 13 〉	통과 (0.01ms, 74.2MB)
테스트 14 〉	통과 (0.02ms, 77.5MB)
테스트 15 〉	통과 (0.01ms, 72.6MB)
테스트 16 〉	통과 (0.02ms, 75.9MB)
