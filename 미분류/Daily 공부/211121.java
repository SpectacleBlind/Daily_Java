class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[3];
        int one = 0;
        int two = 0;
        int three = 0;
        int big = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) one++;
            if(arr[i] == 2) two++;
            if(arr[i] == 3) three++;
        }
        big = Math.max(one,Math.max(two,three));
        answer[0] = big - one;
        answer[1] = big - two;
        answer[2] = big - three;
        return answer;
        }
        
    }