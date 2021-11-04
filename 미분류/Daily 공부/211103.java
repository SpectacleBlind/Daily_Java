import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        int len = dungeons.length;
          
        Arrays.sort(dungeons, new Comparator<int[]> (){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o2[0] - o1[0];
            }
        });
        
        for(int i = 0; i < len ; i++){
            if(dungeons[i][0] <= k){
                if(i+1 < len && dungeons[i+1][0] <= k -dungeons[i][1]){
               k -= dungeons[i][1];
               answer++;
            }
            }
        }
            
        return answer;
    }
}




class Solution {
	int result = 0;
    public int solution(int k, int[][] dungeons) {
		boolean[] check = new boolean[dungeons.length];
		dfs(k,dungeons,check,0);
		return result;
	}
	public void dfs(int k, int[][] dungeons, boolean[] check, int count){
		if(count >= check.length) {
			result = count;
			return;
		}
		for(int i = 0; i < dungeons.length; i++){
			if(check[i]) continue;
			if(k<dungeons[i][0]){
				result = Math.max(result, count);
				continue;
			}
			check[i] = true;
			dfs(k-dungeons[i][1],dungeons,check,count+1);
			check[i] = false;
		}
        return;
    }
}