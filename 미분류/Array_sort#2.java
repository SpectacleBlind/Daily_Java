public class Solution {
    public int[] solution(int []arr) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(arr[0]);
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1] != arr[i]){
                sb.append(arr[i]);
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i = 0; i < count ; i++){
            answer[i] = sb.charAt(i)-48;
        }



        return answer;
    }
}

//StringBuilder 사용하여 Array 일부 추출