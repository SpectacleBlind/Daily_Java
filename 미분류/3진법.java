class Solution {
    public int solution(int n) {
        String third = "";
        while(n >= 3){
            third += n%3;
            n /=3;
        }
        third += n;
        return Integer.parseInt(third, 3);
    }
}
// 진법을 바꾸는 문제, 단순하게 해당 진법으로 변환하는 문장
