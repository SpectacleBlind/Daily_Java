import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String number = String.valueOf(n);
        String ans = "";
        char [] num = new char[number.length()];
        for (int i = 0; i < number.length(); i++){
            num[i] += number.charAt(i);
        }
        Arrays.sort(num);
        for (int i = number.length()-1; i >= 0; i--) { 
            ans += num[i]; }

        long answer = Long.parseLong(ans);
        return answer;
    }
}
// 정수를 받아서, Array로 변환 후 다시 Long으로 변환하는 방법
//내림 차순 정렬하기