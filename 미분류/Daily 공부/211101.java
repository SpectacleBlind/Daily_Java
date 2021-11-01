class Solution {
    public int[] solution(int[] prices) {
        int time = prices.length;
        int[] answer = new int[time];
        
        for(int i = 0; i < time; i++ ){
          for(int j = i+1; j < time ; j++){
              if(prices[i] <= prices[j]) answer[i]++;
              else {
               answer[i]++;
                  break;
              }
          }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 77.1MB)
테스트 2 〉	통과 (0.03ms, 77.8MB)
테스트 3 〉	통과 (0.22ms, 73.5MB)
테스트 4 〉	통과 (0.15ms, 73.6MB)
테스트 5 〉	통과 (0.31ms, 79.9MB)
테스트 6 〉	통과 (0.02ms, 75.1MB)
테스트 7 〉	통과 (0.10ms, 80.3MB)
테스트 8 〉	통과 (0.10ms, 75.4MB)
테스트 9 〉	통과 (0.02ms, 79.4MB)
테스트 10 〉	통과 (0.19ms, 79.5MB)
효율성  테스트
테스트 1 〉	통과 (16.42ms, 71MB)
테스트 2 〉	통과 (12.03ms, 66.2MB)
테스트 3 〉	통과 (17.65ms, 73.1MB)
테스트 4 〉	통과 (17.60ms, 70MB)
테스트 5 〉	통과 (13.38ms, 80.6MB)
*/


class Solution {
    public int[] solution(int[] prices) {
		int time = prices.length;
		int[] answer = new int[time];
		
		for(int i = 0; i < time ; i++){
			for(int j = i+1; j < time ; j++){
				 answer[i]++;
				if(prices[i] > prices[j]) break;
				}
			}
        return answer;
    }
}

/*

테스트 1 〉	통과 (0.01ms, 75.5MB)
테스트 2 〉	통과 (0.04ms, 73.1MB)
테스트 3 〉	통과 (0.22ms, 76.9MB)
테스트 4 〉	통과 (0.24ms, 76.8MB)
테스트 5 〉	통과 (0.21ms, 78.1MB)
테스트 6 〉	통과 (0.01ms, 77.5MB)
테스트 7 〉	통과 (0.10ms, 74.1MB)
테스트 8 〉	통과 (0.10ms, 77MB)
테스트 9 〉	통과 (0.02ms, 77.5MB)
테스트 10 〉	통과 (0.18ms, 73.1MB)
효율성  테스트
테스트 1 〉	통과 (19.71ms, 72.5MB)
테스트 2 〉	통과 (11.76ms, 66.9MB)
테스트 3 〉	통과 (17.36ms, 73.3MB)
테스트 4 〉	통과 (17.29ms, 68.5MB)
테스트 5 〉	통과 (11.66ms, 62.8MB)
*/
