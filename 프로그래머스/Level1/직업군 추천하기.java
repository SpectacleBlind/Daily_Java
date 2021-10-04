/* 프로그래머스 Level 1 문제 풀이
   *. 직업군 추천하기
       개발자가 사용하는 언어와 언어 선호도를 입력하면 그에 맞는 직업군을 추천해주는 알고리즘을 개발하려고 합니다.
       
       */

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        int max = 0;
        String maxJob = "";

        for (int i = 0; i < table.length; i++) {
            String jobLang[] = table[i].split(" ");
            String job = "";
            int sum = 0;

            for (int j = 0; j < jobLang.length; j++) {
                int score = jobLang.length - j;

                //0번째 직업군 이름
                if (j == 0) {
                    job = jobLang[j];
                    continue;
                }

                //직업군 언어와 개발자언어가 같은 경우 점수 계산
                for (int k = 0; k < languages.length; k++) {
                    if (languages[k].equals(jobLang[j])) {
                        sum += preference[k] * score;
                    }
                }
            }

            //점수가 가장 크거나 같을때
            if (max <= sum) {
                //점수가 같으면 사전순으로 비교 (음수일 경우 사전순으로 더 빠르기 때문에 스킵)
                if (max == sum) {
                    if (maxJob.compareTo(job) < 0) {
                        continue;
                    }
                }

                max = sum;
                maxJob = job;
            }
        }

        //System.out.println(maxJob + " : " + max);

        return maxJob;
    }
}


//


import java.util.*;
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int score=-1;
        for(String str : table){
            String[] t = str.split(" ");
            String tname = t[0];
            int tscore = 0;
            for(int i=0;i<languages.length;i++){
                int idx = Arrays.asList(t).indexOf(languages[i]);
                if(idx>-1) tscore+=preference[i]*(6-idx);
            }
            if(score ==tscore && answer.compareTo(tname)>0) answer=tname;
            if(score<tscore){
                score =tscore;
                answer= tname;
            }
        }
        return answer;
    }
}
