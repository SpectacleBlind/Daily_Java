import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        String[] temp = new String[length];
        String[] answer = new String[length];
        
        for(int i = 0; i < length; i++){
            temp[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i < length; i++){
            answer[i] = temp[i].substring(1);
        }
        return answer;
    }
}



import java.util.Arrays;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length ; i++) answer[i] = strings[i].charAt(n) + "" + strings[i];
        
        Arrays.sort(answer);
        for(int i = 0; i < strings.length ; i++){
          answer[i] = answer[i].substring(1);    
        }
        
        return answer;
    }
}

테스트 1 〉	통과 (9.41ms, 88.3MB)
테스트 2 〉	통과 (8.67ms, 80.8MB)
테스트 3 〉	통과 (9.36ms, 77MB)
테스트 4 〉	통과 (8.69ms, 78.4MB)
테스트 5 〉	통과 (13.70ms, 71.9MB)
테스트 6 〉	통과 (11.35ms, 80.2MB)
테스트 7 〉	통과 (11.71ms, 79.4MB)
테스트 8 〉	통과 (9.24ms, 74.7MB)
테스트 9 〉	통과 (13.78ms, 76.7MB)
테스트 10 〉	통과 (9.74ms, 74.5MB)
테스트 11 〉	통과 (8.69ms, 77.5MB)
테스트 12 〉	통과 (14.67ms, 83.9MB)










import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
         int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
  }
    }

테스트 1 〉	통과 (2.35ms, 86MB)
테스트 2 〉	통과 (2.48ms, 67.6MB)
테스트 3 〉	통과 (3.16ms, 65.4MB)
테스트 4 〉	통과 (3.44ms, 73.4MB)
테스트 5 〉	통과 (2.24ms, 77.2MB)
테스트 6 〉	통과 (5.71ms, 80.5MB)
테스트 7 〉	통과 (2.78ms, 74MB)
테스트 8 〉	통과 (3.39ms, 76.6MB)
테스트 9 〉	통과 (3.38ms, 73.2MB)
테스트 10 〉	통과 (3.65ms, 69.6MB)
테스트 11 〉	통과 (2.64ms, 79.2MB)
테스트 12 〉	통과 (2.54ms, 76MB)
테스트 13 〉	통과 (3.93ms, 90.7MB)
테스트 14 〉	통과 (2.90ms, 78.2MB)
테스트 15 〉	통과 (2.67ms, 80.3MB)
테스트 16 〉	통과 (2.46ms, 80.3MB)

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









import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}

테스트 1 〉	통과 (0.02ms, 76.2MB)
테스트 2 〉	통과 (0.04ms, 76.8MB)
테스트 3 〉	통과 (0.06ms, 80.3MB)
테스트 4 〉	통과 (0.06ms, 73.2MB)
테스트 5 〉	통과 (0.04ms, 74.6MB)
테스트 6 〉	통과 (0.07ms, 81.4MB)
테스트 7 〉	통과 (0.04ms, 79.2MB)
테스트 8 〉	통과 (0.08ms, 77.7MB)
테스트 9 〉	통과 (0.05ms, 75MB)
테스트 10 〉	통과 (0.07ms, 68.5MB)
테스트 11 〉	통과 (0.05ms, 79.1MB)
테스트 12 〉	통과 (0.06ms, 75.4MB)
테스트 13 〉	통과 (0.05ms, 76.2MB)
테스트 14 〉	통과 (0.07ms, 75.7MB)
테스트 15 〉	통과 (0.04ms, 74.2MB)
테스트 16 〉	통과 (0.05ms, 74.3MB)
테스트 17 〉	통과 (0.03ms, 77.4MB)
효율성  테스트
테스트 1 〉	통과 (26.67ms, 125MB)
테스트 2 〉	통과 (23.41ms, 124MB)
테스트 3 〉	통과 (28.15ms, 124MB)
테스트 4 〉	통과 (27.46ms, 127MB)


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
}테스트 1 〉	통과 (0.04ms, 75.3MB)
테스트 2 〉	통과 (0.08ms, 72.6MB)
테스트 3 〉	통과 (0.06ms, 76.1MB)
테스트 4 〉	통과 (0.05ms, 77.2MB)
테스트 5 〉	통과 (0.05ms, 73.3MB)
테스트 6 〉	통과 (0.06ms, 75.3MB)
테스트 7 〉	통과 (0.04ms, 76MB)
테스트 8 〉	통과 (0.04ms, 82.7MB)
테스트 9 〉	통과 (0.06ms, 66MB)
테스트 10 〉	통과 (0.04ms, 73.9MB)
테스트 11 〉	통과 (0.07ms, 71.2MB)
테스트 12 〉	통과 (0.03ms, 78.8MB)
테스트 13 〉	통과 (0.07ms, 74.3MB)
테스트 14 〉	통과 (0.08ms, 78.6MB)
테스트 15 〉	통과 (0.05ms, 67.8MB)
테스트 16 〉	통과 (0.07ms, 85MB)
테스트 17 〉	통과 (0.03ms, 76.4MB)
효율성  테스트
테스트 1 〉	통과 (34.96ms, 121MB)
테스트 2 〉	통과 (35.30ms, 123MB)
테스트 3 〉	통과 (34.34ms, 122MB)
테스트 4 〉	통과 (35.92ms, 123MB)
