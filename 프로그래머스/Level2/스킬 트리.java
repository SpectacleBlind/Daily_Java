/* 프로그래머스 Level 2 문제 풀이
   *. 스킬트리

       */

import java.util.HashMap;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int answer = 0;
        int[] tree = new int[skill.length()];
        boolean check = true;
        for(int i = 0; i < skill.length() ; i++){
            tree[i] = skill.charAt(i);
        }

        for (int i = 0; i < skill_trees.length; i++){
            for(int j = 0; j < tree.length; j++){
                for(int k = 0; k < skill_trees[i].length() ; k++){
                  if(tree[j] == skill_trees[i].charAt(k)) map.put(tree[j],k);
            }
              for(int m = 1; m < tree.length ; m++){
                  if(map.get(tree[m-1]) > map.get(tree[m])) check = false;
                  break;
              }
            if (check) answer++;
          }     
        }        
        */
        return answer;
    }
}

//해시맵으로 해보려 했지만 정신만 없어진 코드;;;



class Solution {
    public int solution(String skill, String[] skill_trees) {
        boolean check;
        int answer = 0;
     
        for(String s : skill_trees){
            check = true;
            int skillNum = 0;
            out:
            for(int i = 0; i < s.length() ; i++){
                if(skill.indexOf(s.charAt(i)) > -1){
                   if(skill.charAt(skillNum) == s.charAt(i)){
                      skillNum++;
                   }
                   else{
                     check = false;
                     break out;
                   }
                }
            }
            if (check) answer++;
        }
        return answer;
    }
}


/*
 * 테스트 1 〉	통과 (0.02ms, 74.6MB)
테스트 2 〉	통과 (0.03ms, 66.9MB)
테스트 3 〉	통과 (0.02ms, 75.1MB)
테스트 4 〉	통과 (0.03ms, 73.9MB)
테스트 5 〉	통과 (0.02ms, 71.4MB)
테스트 6 〉	통과 (0.03ms, 70.2MB)
테스트 7 〉	통과 (0.02ms, 78.4MB)
테스트 8 〉	통과 (0.02ms, 71.4MB)
테스트 9 〉	통과 (0.03ms, 74.9MB)
테스트 10 〉	통과 (0.02ms, 72.1MB)
테스트 11 〉	통과 (0.03ms, 76.4MB)
테스트 12 〉	통과 (0.03ms, 75.2MB)
테스트 13 〉	통과 (0.04ms, 76.6MB)
테스트 14 〉	통과 (0.04ms, 71.7MB)
 */


// 다른 사람의 풀이

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean isSkill;
        
        for(String s : skill_trees) {  //String 마다 반복, 
            isSkill = true;
            int skillNum = 0; // 해당 값으로 skill 스트링 순서 변경
            int i = 0;
            for(i=0; i<s.length(); i++) {
                if(skill.indexOf(s.charAt(i))>-1) { //indexOf 에서 없으면 -1!
                    if(skill.charAt(skillNum) == s.charAt(i)) {
                        skillNum++;
                    }
                    else {
                        isSkill = false;
                        break;
                    }  
                }
            }
            if(isSkill) {
                answer++;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 73.6MB)
테스트 2 〉	통과 (0.03ms, 77.1MB)
테스트 3 〉	통과 (0.02ms, 74.2MB)
테스트 4 〉	통과 (0.03ms, 71.8MB)
테스트 5 〉	통과 (0.03ms, 75.9MB)
테스트 6 〉	통과 (0.04ms, 81.9MB)
테스트 7 〉	통과 (0.03ms, 65.8MB)
테스트 8 〉	통과 (0.02ms, 74.9MB)
테스트 9 〉	통과 (0.02ms, 76MB)
테스트 10 〉	통과 (0.03ms, 75.2MB)
테스트 11 〉	통과 (0.04ms, 77.2MB)
테스트 12 〉	통과 (0.03ms, 77.5MB)
테스트 13 〉	통과 (0.03ms, 72.8MB)
테스트 14 〉	통과 (0.03ms, 74.4MB)
 */