class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else if(s.charAt(i - 1) == ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
                }
            else{
                sb.append(s.charAt(i));   
                }
            }
        answer=sb.toString();
        return answer;            

}
}




테스트 1 〉	통과 (0.08ms, 71MB)
테스트 2 〉	통과 (0.05ms, 76.3MB)
테스트 3 〉	통과 (0.06ms, 75.8MB)
테스트 4 〉	통과 (0.09ms, 77.2MB)
테스트 5 〉	통과 (0.09ms, 81.3MB)
테스트 6 〉	통과 (0.09ms, 89.8MB)
테스트 7 〉	통과 (0.05ms, 72MB)
테스트 8 〉	통과 (0.08ms, 75.4MB)
테스트 9 〉	통과 (0.06ms, 78.8MB)
테스트 10 〉	통과 (0.08ms, 74.1MB)
테스트 11 〉	통과 (0.09ms, 74.8MB)
테스트 12 〉	통과 (0.10ms, 73.7MB)
테스트 13 〉	통과 (0.06ms, 73.6MB)
테스트 14 〉	통과 (0.06ms, 73.9MB)
테스트 15 〉	통과 (0.11ms, 76.7MB)
테스트 16 〉	통과 (0.08ms, 76.8MB)














JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )








class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();       
        boolean flag = true;
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length() ; i++){
          if(s.charAt(i-1) == ' ') flag = true;
          if(flag) {
            sb.append(Character.toUpperCase(s.charAt(i)));
            flag = false;
            }
           else sb.append(s.charAt(i)); 
         }
        return sb.toString();
    }
}


테스트 1 〉	통과 (0.05ms, 70.2MB)
테스트 2 〉	통과 (0.09ms, 72.3MB)
테스트 3 〉	통과 (0.08ms, 70.2MB)
테스트 4 〉	통과 (0.06ms, 77.2MB)
테스트 5 〉	통과 (0.11ms, 72.3MB)
테스트 6 〉	통과 (0.07ms, 72.1MB)
테스트 7 〉	통과 (0.05ms, 75.2MB)
테스트 8 〉	통과 (0.04ms, 81.3MB)
테스트 9 〉	통과 (0.06ms, 76.2MB)
테스트 10 〉	통과 (0.04ms, 74MB)
테스트 11 〉	통과 (0.07ms, 74.2MB)
테스트 12 〉	통과 (0.09ms, 77.4MB)
테스트 13 〉	통과 (0.05ms, 72.9MB)
테스트 14 〉	통과 (0.07ms, 83.9MB)
테스트 15 〉	통과 (0.10ms, 76MB)
테스트 16 〉	통과 (0.04ms, 76.4MB)















class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        s = s.toLowerCase();
        for(int i = 1; i < s.length(); i++){
         if(s.charAt(i-1) == ' ') sb.append (Character.toUpperCase(s.charAt(i)));
         else sb.append(s.charAt(i));
         }

        return sb.toString();
    }
}

테스트 1 〉	통과 (0.05ms, 71.4MB)
테스트 2 〉	통과 (0.06ms, 76.4MB)
테스트 3 〉	통과 (0.05ms, 75.9MB)
테스트 4 〉	통과 (0.11ms, 74.6MB)
테스트 5 〉	통과 (0.11ms, 71.8MB)
테스트 6 〉	통과 (0.07ms, 73MB)
테스트 7 〉	통과 (0.07ms, 72.5MB)
테스트 8 〉	통과 (0.07ms, 76.4MB)
테스트 9 〉	통과 (0.08ms, 79.3MB)
테스트 10 〉	통과 (0.06ms, 76.4MB)
테스트 11 〉	통과 (0.08ms, 75.9MB)
테스트 12 〉	통과 (0.05ms, 76MB)
테스트 13 〉	통과 (0.08ms, 74.8MB)
테스트 14 〉	통과 (0.05ms, 67.2MB)
테스트 15 〉	통과 (0.06ms, 74.3MB)
테스트 16 〉	통과 (0.04ms, 73.3MB)











class Solution {
 public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[0].length; j++)
                for (int n = 0; n < arr1[0].length; n++)
                    answer[i][j] += (arr1[i][n] * arr2[n][j]);

        return answer;
    }
}




















class Solution {
public int solution(int n) {
        int answer = 0;
        int num1 = 1;
        int num2 = 1;
        
        if(n==1 || n==2) return 1;
        else {
            for(int i=3; i<=n; i++) {
                answer = (num1+num2)%1234567;
                num1 = num2;
                num2 = answer;
                
            }
            return answer;
        }
    }
}








피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

예를들어

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
와 같이 이어집니다.

2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

제한 사항
n은 2 이상 100,000 이하인 자연수입니다.




class Solution {
    public int solution(int n) {

        int first = 0;
        int second = 1;
        int temp = 0;

        for(int i = 2; i <= n; i++){
        temp = (first + second)%1234567; // int 범위를 넘어가니까, 1234567로 나누어 놓은걸로 미리 해놔도 좋다
        first = second; 
        second = temp;  
        }
        
        return second;
    }
}










import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length;
        int answer = 0;        
        for(int i = 0; i < length; i++){
            answer += A[i]*B[length-1-i];
        }
        

        return answer;
    }
}







import java.util.Arrays;

class Solution{
    public int solution(int []A, int []B)    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
       int len = B.length - 1;

       for(int i = 0; i < A.length ; i++) answer +=A[i]*B[len-i];

        return answer;
    }
}

