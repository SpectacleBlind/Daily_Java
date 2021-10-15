/* 프로그래머스 Level 2 문제 풀이
   *.뉴스 클러스터링
       */



import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList <String> set1 = new ArrayList<>();
        ArrayList <String> set2 = new ArrayList<>();
        ArrayList <String> common = new ArrayList<>();
        ArrayList <String> sum = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
       
        for(int i = 0; i < str1.length() -1 ; i++){
            if(str1.charAt(i) >='A' && str1.charAt(i) <='Z' && str1.charAt(i+1) >='A' && str1.charAt(i+1) <='Z'){
                set1.add(str1.charAt(i) + "" + str1.charAt(i+1));
            }
        }
        
        for(int i = 0; i < str2.length() -1 ; i++){
            if(str2.charAt(i) >='A' && str2.charAt(i) <='Z' && str2.charAt(i+1) >='A' && str2.charAt(i+1) <='Z'){
                set2.add(str2.charAt(i) + "" + str2.charAt(i+1));
            }
        }
        Collections.sort(set1);
        Collections.sort(set2);
        
        for(String s : set1){
            if(set2.remove(s)) common.add(s);
            sum.add(s);
        }
        
        for(String s : set2){
            sum.add(s);
        }
        
        double answer = 0;
        
        if(sum.size() == 0){
            answer = 1;
        }
        else answer = (double)common.size() / (double)sum.size();
        
        return (int)(answer*65536);
    }
}


/*
 * 테스트 1 〉	통과 (7.24ms, 78.6MB)
테스트 2 〉	통과 (7.33ms, 78.8MB)
테스트 3 〉	통과 (11.08ms, 74.1MB)
테스트 4 〉	통과 (13.93ms, 75MB)
테스트 5 〉	통과 (7.03ms, 75.7MB)
테스트 6 〉	통과 (8.25ms, 82.1MB)
테스트 7 〉	통과 (7.98ms, 77.1MB)
테스트 8 〉	통과 (8.90ms, 81.9MB)
테스트 9 〉	통과 (9.79ms, 76MB)
테스트 10 〉	통과 (12.74ms, 88.9MB)
테스트 11 〉	통과 (9.15ms, 72.5MB)
테스트 12 〉	통과 (0.19ms, 76.7MB)
테스트 13 〉	통과 (8.68ms, 82.9MB)
 */

















import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList <String> set1 = new ArrayList<>();
        ArrayList <String> set2 = new ArrayList<>();
        ArrayList <String> common = new ArrayList<>();
        ArrayList <String> sum = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
               
        for(int i = 0; i < str1.length() -1; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            
            if(first >= 'A' && first <= 'Z' &&
             second >= 'A' && second <= 'Z'){
              set1.add(first + "" + second);
          }
        }
        
        for(int i = 0; i < str2.length() -1; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            
            if(first >= 'A' && first <= 'Z' &&
             second >= 'A' && second <= 'Z'){
              set2.add(first + "" + second);
          }
        }
        
        Collections.sort(set1);
        Collections.sort(set2);
        
        for(String s : set1){
            if(set2.remove(s)) common.add(s);
            sum.add(s);
        }
        
        for(String s : set2){
            sum.add(s);
        }
        
        double answer = 0;
        
        if(sum.size() == 0){
            answer = 1;
        }
        else answer = (double)common.size() / (double)sum.size();
        
        return (int)(answer*65536);
    }
}

/*
 * 테스트 1 〉	통과 (8.48ms, 72.4MB)
테스트 2 〉	통과 (7.19ms, 76.8MB)
테스트 3 〉	통과 (7.21ms, 78.4MB)
테스트 4 〉	통과 (11.33ms, 77.2MB)
테스트 5 〉	통과 (7.29ms, 77.3MB)
테스트 6 〉	통과 (7.24ms, 75.7MB)
테스트 7 〉	통과 (7.84ms, 78.5MB)
테스트 8 〉	통과 (7.31ms, 78.7MB)
테스트 9 〉	통과 (7.96ms, 79.2MB)
테스트 10 〉	통과 (8.07ms, 70.4MB)
테스트 11 〉	통과 (9.06ms, 71MB)
테스트 12 〉	통과 (0.26ms, 75.2MB)
테스트 13 〉	통과 (7.28ms, 79.8MB)
 */


// 다른 사람의 풀이

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> multiSet1 = new ArrayList<>();
        ArrayList<String> multiSet2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        for(int i = 0; i < str1.length() -1; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            
            if(first >= 'A' && first <= 'Z' &&
             second >= 'A' && second <= 'Z'){
              multiSet1.add(first + "" + second);
          }
        }
        
        for(int i = 0; i < str2.length() -1; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            
            if(first >= 'A' && first <= 'Z' &&
             second >= 'A' && second <= 'Z'){
              multiSet2.add(first + "" + second);
          }
        }
        
        Collections.sort(multiSet1);
      Collections.sort(multiSet2);
            
      for(String s : multiSet1){
          if(multiSet2.remove(s)){
            intersection.add(s);
          }
          union.add(s);
      }
      
      for(String s : multiSet2){
          union.add(s);
      }
      
      double jakard = 0;
      
      if(union.size() == 0) {
          jakard = 1;
      } else {
          jakard = (double)intersection.size() / (double)union.size();
      }
            
      return (int)(jakard * 65536);
    }
}
