class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        
        for(int i = 0; i<n ; i++){
        int number = arr1[i];
        int count = 0;
            while (number >=2){
                map1[i] += number%2;
                number /=2;
                count++;
        }
               map1[i] += number;
               count++;
            if(count < n){
                map1[i] += "0";
                count++;
            }
        }
        for(int i = 0; i<n ; i++){
        int number = arr2[i];
        int count = 0;
            while (number >=2){
                map2[i] += number%2;
                number /=2;
                count++;
        }
               map2[i] += number;
               count++;
            if(count < n){
                map2[i] += "0";
                count++;
            }
        }
        
        for(int i = 0; i<n ; i++){
         for(int j = n-1; j >= 0  ; i--){
        if ((map1[i].charAt(j) == map2[i].charAt(j)) && (map1[i].charAt(j) == '0')){
            answer[i] += " ";
        }
        else {
             answer[i] += "#";
        }
        }

    }
                return answer;

}
    }