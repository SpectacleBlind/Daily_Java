class Min_Remover {
    public int[] Min_Remover (int[] arr) {
        int[] answer = new int[arr.length-1];
        if (arr.length <= 1){
          int[] answer2 = {-1};
          return answer2;
        }
        
        else{
          int min = arr[0];
            for (int i = 0; i < arr.length ; i++){
              min = min < arr[i] ? min : arr[i];
            }
            //몇개의 값을 빼고, 나머지를 새로운 array에 넣을 수 있는 방법
            int index = 0;
              for (int j = 0; j < arr.length; j++) {
                 if (min == arr[j]) {
                 continue;
              } 
              else { 
                answer[index++] = arr[j];
              }
       }
        return answer;
    }
}
}