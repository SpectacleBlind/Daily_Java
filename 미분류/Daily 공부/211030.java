import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
      String [] array = s.split("");
      StringBuilder sb = new StringBuilder();
      Arrays.sort(array,Collections.reverseOrder());
      for(String i : array) sb.append(array[i]);     
      return sb.toString();

        
    }
}











import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
		String[] arr = s.split("");
		Arrays.sort(arr,Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(String i : arr) sb.append(i);
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.70ms, 77.3MB)
테스트 2 〉	통과 (0.63ms, 78.9MB)
테스트 3 〉	통과 (0.58ms, 69.6MB)
테스트 4 〉	통과 (0.77ms, 76.5MB)
테스트 5 〉	통과 (2.25ms, 74.7MB)
테스트 6 〉	통과 (2.07ms, 76.5MB)
테스트 7 〉	통과 (0.98ms, 83.8MB)
테스트 8 〉	통과 (1.39ms, 75.3MB)
테스트 9 〉	통과 (1.38ms, 71.7MB)
테스트 10 〉	통과 (1.48ms, 71.8MB)
테스트 11 〉	통과 (0.84ms, 77.8MB)
테스트 12 〉	통과 (1.40ms, 67.5MB)
테스트 13 〉	통과 (0.80ms, 75MB)
테스트 14 〉	통과 (0.61ms, 77.5MB)
테스트 15 〉	통과 (0.53ms, 71.4MB)
테스트 16 〉	통과 (0.39ms, 79.1MB)
*/



class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
           if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        return p == y;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 73.8MB)
테스트 2 〉	통과 (0.02ms, 74.3MB)
테스트 3 〉	통과 (0.03ms, 76.6MB)
테스트 4 〉	통과 (0.01ms, 74.1MB)
테스트 5 〉	통과 (0.02ms, 72.5MB)
테스트 6 〉	통과 (0.02ms, 78.8MB)
테스트 7 〉	통과 (0.02ms, 75.4MB)
테스트 8 〉	통과 (0.03ms, 81.5MB)
테스트 9 〉	통과 (0.04ms, 74.5MB)
테스트 10 〉	통과 (0.04ms, 77.8MB)
테스트 11 〉	통과 (0.03ms, 74.1MB)
테스트 12 〉	통과 (0.04ms, 73MB)
테스트 13 〉	통과 (0.02ms, 75.5MB)
테스트 14 〉	통과 (0.04ms, 74.9MB)
테스트 15 〉	통과 (0.03ms, 78.1MB)
테스트 16 〉	통과 (0.03ms, 71.4MB)
테스트 17 〉	통과 (0.04ms, 75.1MB)
테스트 18 〉	통과 (0.02ms, 70.7MB)
테스트 19 〉	통과 (0.04ms, 79.2MB)
테스트 20 〉	통과 (0.02ms, 71.4MB)
테스트 21 〉	통과 (0.04ms, 76.2MB)
테스트 22 〉	통과 (0.03ms, 77.5MB)
테스트 23 〉	통과 (0.04ms, 80.1MB)
테스트 24 〉	통과 (0.03ms, 70.7MB)
테스트 25 〉	통과 (0.02ms, 71.6MB)
테스트 26 〉	통과 (0.03ms, 75.6MB)
테스트 27 〉	통과 (0.03ms, 70.8MB)
테스트 28 〉	통과 (0.05ms, 70.9MB)
테스트 29 〉	통과 (0.02ms, 72.7MB)
테스트 30 〉	통과 (0.03ms, 74.7MB)
*/



class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'p') p++;
            if(s.charAt(i) == 'y') y++;
        }
        
        return (p==y)? true : false ;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 77.5MB)
테스트 2 〉	통과 (0.02ms, 73MB)
테스트 3 〉	통과 (0.03ms, 76.5MB)
테스트 4 〉	통과 (0.03ms, 74.6MB)
테스트 5 〉	통과 (0.04ms, 82.7MB)
테스트 6 〉	통과 (0.04ms, 71.3MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.03ms, 78.6MB)
테스트 9 〉	통과 (0.05ms, 74.4MB)
테스트 10 〉	통과 (0.03ms, 70.9MB)
테스트 11 〉	통과 (0.04ms, 66.4MB)
테스트 12 〉	통과 (0.05ms, 74.4MB)
테스트 13 〉	통과 (0.03ms, 71.6MB)
테스트 14 〉	통과 (0.03ms, 67.8MB)
테스트 15 〉	통과 (0.04ms, 75.2MB)
테스트 16 〉	통과 (0.02ms, 71.2MB)
테스트 17 〉	통과 (0.04ms, 72.4MB)
테스트 18 〉	통과 (0.05ms, 74.5MB)
테스트 19 〉	통과 (0.04ms, 71.7MB)
테스트 20 〉	통과 (0.04ms, 74.7MB)
테스트 21 〉	통과 (0.04ms, 67MB)
테스트 22 〉	통과 (0.04ms, 75.7MB)
테스트 23 〉	통과 (0.04ms, 73.2MB)
테스트 24 〉	통과 (0.05ms, 77.5MB)
테스트 25 〉	통과 (0.04ms, 71.3MB)
테스트 26 〉	통과 (0.03ms, 73.5MB)
테스트 27 〉	통과 (0.06ms, 74.7MB)
테스트 28 〉	통과 (0.04ms, 76.7MB)
테스트 29 〉	통과 (0.03ms, 71.3MB)
테스트 30 〉	통과 (0.03ms, 76.2MB)
*/


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        StringBuilder sb = new StringBuilder();
        
        int index = 10;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != index) {
                sb.append(arr[i]);
                index = arr[i];
        }
        }
        String answer = sb.toString();
        int[] ans = new int[answer.length()];    
        for(int i = 0; i < answer.length() ; i++) ans[i] = answer.charAt(i)-'0';
        

        return ans;
    }
}




import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i = 0; i< arr.length ; i++){
            if(arr[i]%divisor == 0) count++;
        }
        if (count == 0){
            int[] a = {-1};
            return a;
        }
        int[] answer = new int[count];
        
        int index = 0;
        for(int i = 0; i< arr.length ; i++){
            if(arr[i]%divisor == 0) {
                answer[index] = arr[i];
                index++;
        }
        }
        Arrays.sort(answer);
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.48ms, 77MB)
테스트 2 〉	통과 (0.41ms, 76.9MB)
테스트 3 〉	통과 (0.44ms, 75.6MB)
테스트 4 〉	통과 (0.34ms, 73.7MB)
테스트 5 〉	통과 (0.33ms, 77.1MB)
테스트 6 〉	통과 (2.34ms, 89.6MB)
테스트 7 〉	통과 (0.07ms, 67.3MB)
테스트 8 〉	통과 (0.02ms, 78MB)
테스트 9 〉	통과 (0.59ms, 84.6MB)
테스트 10 〉	통과 (0.52ms, 82.8MB)
테스트 11 〉	통과 (0.37ms, 76.6MB)
테스트 12 〉	통과 (0.45ms, 74.7MB)
테스트 13 〉	통과 (0.24ms, 82.5MB)
테스트 14 〉	통과 (5.06ms, 72.6MB)
테스트 15 〉	통과 (0.62ms, 79.3MB)
테스트 16 〉	통과 (0.50ms, 73.2MB)
*/




import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        boolean[] chk  = new boolean [arr.length];
        int len = 0;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor == 0) {
                chk[i] = true;
                len++;
        }
        }
        if(len == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[len];
            
        for(int i = 0; i < arr.length; i++){
            if(chk[i]){
                answer[count] = arr[i];
                count++;
            } 
        }

        Arrays.sort(answer);
        return answer;
}
}
/*
테스트 1 〉	통과 (0.32ms, 78.3MB)
테스트 2 〉	통과 (0.32ms, 78.8MB)
테스트 3 〉	통과 (0.35ms, 70.9MB)
테스트 4 〉	통과 (0.36ms, 73.7MB)
테스트 5 〉	통과 (0.34ms, 73.8MB)
테스트 6 〉	통과 (1.33ms, 86.4MB)
테스트 7 〉	통과 (0.09ms, 77.6MB)
테스트 8 〉	통과 (0.01ms, 72.4MB)
테스트 9 〉	통과 (0.39ms, 67.2MB)
테스트 10 〉	통과 (0.45ms, 84.6MB)
테스트 11 〉	통과 (0.43ms, 76.3MB)
테스트 12 〉	통과 (0.40ms, 78.4MB)
테스트 13 〉	통과 (0.11ms, 75.1MB)
테스트 14 〉	통과 (0.42ms, 78MB)
테스트 15 〉	통과 (0.48ms, 76.7MB)
테스트 16 〉	통과 (0.39ms, 73MB)
*/