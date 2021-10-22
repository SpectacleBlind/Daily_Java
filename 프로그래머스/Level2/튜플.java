/* 프로그래머스 Level 2 문제 풀이
   *. 튜플
   * */
   

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>(); //ArrayList로 생성
        s = s.substring(2,s.length()-2).replace("},{" , "-"); // substring 으로 앞 뒤 2개씩 삭제, 그 다음 },{ 한꺼번에 치환
        String[] str = s.split("-"); // - 기준으로 나누기
        
        
        Arrays.sort(str,new Comparator<String>(){ //오름차순 오버라이딩
            public int compare(String o1, String o2){
                
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
         for(String x : str){
            String[] temp = x.split(","); //집합 안에서 원소 나누기
            for(int i = 0 ; i < temp.length;i++){
                int n = Integer.parseInt(temp[i]);
                if(!answer.contains(n))//없다면 추가!
                    answer.add(n);
            }
        }
        return answer;
    }
}