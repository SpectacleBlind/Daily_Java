/* 프로그래머스 Level 2 문제 풀이
   *. 모음 사전
       */

class Solution {
	public int solution(String word) {
		String str = "AEIOU";
		int[] x = {781,156,31,6,1}; //점화식을 구하는 문제
		int index,result = word.length();
		for(int i = 0 ; i<word.length(); i++){
			index = str.indexOf(word.charAt(i)); //AEIOU 순서로 몇번째인지 인덱스 구하기
			result += x[i]*index; //결과값에 더하기
		}
		return result;
	}
}

// 다른 사람의 풀이

class Solution {
    public int solution(String word) {
        int answer = 0, per = 3905;
        for(String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        return answer;
    }
}

//다른 사람의 풀이 #2

import java.util.*;
class Solution {
    List<String> list = new ArrayList<>();
    void dfs(String str, int len) {
        if(len > 5) return;
        list.add(str);
        for(int i = 0; i < 5; i++) dfs(str + "AEIOU".charAt(i), len + 1);
    }
    public int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }
}

// 다른 사람의 풀이#3

class Solution {
    public int solution(String word) {
        int answer = 0;
        int mul = 781;

        char chr[] = {'A', 'E', 'I', 'O', 'U'};

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<5; j++){
                if(chr[j] == word.charAt(i)){
                    answer += 1 + j * mul;
                }
            }
            mul = (mul-1)/5;
        }

        return answer;
    }
}