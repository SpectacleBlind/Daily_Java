
//약수의 합 클래스
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; i++){
            if (n%i == 0){
                answer += i;
            } 
        }
        //n의 약수는 n 보다 작을 것이므로, for문을 통해, 단순하게 n과 나누어 떨어지는 수(=약수) 전체를 더한다.
        return answer;
    }
}