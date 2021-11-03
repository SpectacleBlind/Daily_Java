/* 프로그래머스 Level 2 문제 풀이

   *. 피로도
   * */
   

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