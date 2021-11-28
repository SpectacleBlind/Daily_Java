import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes,(a,b)->Integer.compare(a[1],b[1])); // 오름차순 정렬
        int answer = 0;
        int min = -30001;
        for(int[] i : routes){ //routes에서 하나씩
            if(min < i[0]){ //min보다 i[0]이 크면 == min에 들어가지 않으면
                min = i[1]; //
                answer++;
            }
        }
        return answer;
    }
}