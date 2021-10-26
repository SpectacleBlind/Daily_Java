/* 프로그래머스 Level 2 문제 풀이

   *. 소수 찾기
   * */
   
class Solution {
    public boolean[] comb = new boolean[10000000];
    public boolean[] taken = new boolean[7];
    public String num;
    
    public int solution(String numbers) {
        int answer = 0;
        num = numbers;
        rec("",0);
        for(int i = 2;i < 10000000; i++) if(comb[i] && Prime(i)) answer++;
        return answer;
    }
    
    public boolean Prime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num%i ==0) return false;
        }
        return true;
    }
    
    public void rec(String str, int idx){
        if(idx == num.length()+1) return;
        if(str != ""){
            int num = Integer.parseInt(str);
            comb[num] = true;
        }
        for(int i = 0; i<num.length(); i++){
            if(!taken[i]){
                taken[i] = true;
                rec(str+num.charAt(i),idx+1);
                taken[i] = false;
            }
        }
    }
}
/*
테스트 1 〉	통과 (17.79ms, 97.4MB)
테스트 2 〉	통과 (27.47ms, 88.7MB)
테스트 3 〉	통과 (16.19ms, 89.7MB)
테스트 4 〉	통과 (27.07ms, 86.6MB)
테스트 5 〉	통과 (41.39ms, 106MB)
테스트 6 〉	통과 (20.07ms, 94.7MB)
테스트 7 〉	통과 (19.08ms, 90.6MB)
테스트 8 〉	통과 (42.69ms, 89.9MB)
테스트 9 〉	통과 (15.78ms, 89.6MB)
테스트 10 〉	통과 (29.27ms, 93.8MB)
테스트 11 〉	통과 (25.32ms, 97.4MB)
테스트 12 〉	통과 (19.78ms, 99.7MB)
*/


//소수 찾기를 sqrt 말고 /2로 두었을 때
/*
테스트 1 〉	통과 (16.47ms, 87.1MB)
테스트 2 〉	통과 (28.63ms, 98.6MB)
테스트 3 〉	통과 (15.40ms, 93.2MB)
테스트 4 〉	통과 (28.90ms, 92.4MB)
테스트 5 〉	통과 (31.25ms, 88.7MB)
테스트 6 〉	통과 (15.55ms, 91.1MB)
테스트 7 〉	통과 (16.04ms, 84.1MB)
테스트 8 〉	통과 (35.96ms, 102MB)
테스트 9 〉	통과 (17.03ms, 86.3MB)
테스트 10 〉	통과 (67.62ms, 114MB)
테스트 11 〉	통과 (30.10ms, 94.7MB)
테스트 12 〉	통과 (17.40ms, 102MB)
확실히 큰 수를 판단할 때는 sqrt가 더 효율적인것 같다
*/