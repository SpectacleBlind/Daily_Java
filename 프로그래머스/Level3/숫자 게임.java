import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int len = A.length-1;
        int lenB = B.length-1;
        for(int i = len; i >=0; i--){
            if(B[lenB] > A[i]) {
                answer++;
                lenB--;
            }
        }
        
        return answer;
    }
}