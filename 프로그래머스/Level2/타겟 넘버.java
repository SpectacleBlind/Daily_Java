/* 프로그래머스 Level 2 문제 풀이
   *. 타겟 넘버
       */

class Solution {
    public int solution(int[] numbers, int target) {
        return bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);
    }
    
    public int bfs(int[] numbers, int target, int sum , int i){
        if( i == numbers.length){
            if(sum == target) return 1;
            else return 0;
        }
        int result = 0;
        result += bfs(numbers, target, sum+numbers[i], i+1);
        result += bfs(numbers, target, sum-numbers[i], i+1);
        return result;
        
    }
}