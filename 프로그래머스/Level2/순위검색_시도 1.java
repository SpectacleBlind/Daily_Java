/* 프로그래머스 Level 2 문제 풀이

   *. 순위 검색
   * */
   
//주먹구구식 풀이
class Solution {
    public int[] solution(String[] info, String[] query) {
        int len = info.length;
        int len2 = query.length;
        int[] answer = new int [len];
        String[][] info_arr = new String[len][5];
        String[][] query_arr = new String[len2][5];
        String[] num_arr = new String[len2];
        
        for(int i = 0; i < len ; i++){
            info_arr[i] = info[i].split(" ");
        }
        
        for(int i = 0; i < len2 ; i++){
            query_arr[i] = query[i].split(" and ");
            num_arr[i] = query_arr[i][3].substring(query_arr[i][3].length()-4);
            query_arr[i][3] = query_arr[i][3].substring(0,query_arr[i][3].length()-5);
        }
        for(int i = 0; i < len ; i++){
            for(int j = 0; j < len2 ; j++){
              if(info_arr[i][0].equals(query_arr[j][0])||query_arr[j][0] =="-"){
                if(info_arr[i][1].equals(query_arr[j][1])||query_arr[j][1] =="-"){
                    if(info_arr[i][2].equals(query_arr[j][2])||query_arr[j][2] =="-"){
                        if(info_arr[i][3].equals(query_arr[j][3])||query_arr[j][3] =="-"){
                            if(info_arr[i][4].equals(num_arr[j])||num_arr[j] =="-"){
                                answer[j]++;
              }}}}}}
        }
        return answer;
    }
}
// 완전탐색처럼 하려고 했으나 전혀 효율성, 정확도 없음....

