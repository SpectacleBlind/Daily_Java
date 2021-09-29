//제곱근 구하기

class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 0; i<=n; i++ ){
            if(i*i == n){
                answer = (i+1)*(i+1);
            break;
            }
            else answer = -1;
            
        }

        return answer;
    }
}


//Math 클래스 활용
import java.lang.Math; 
class Solution { 
    public long solution(long n) {
        long answer = 0; 
        double base = Math.sqrt(n); 
        if ( base % 1 > 0 ) {
            answer = -1; 
        } 
        else answer = (long) Math.pow(base+1, 2); return answer; 
    } 
}
// 당연하겠지만, Math 활용한 버전이 훨씬 빠르다