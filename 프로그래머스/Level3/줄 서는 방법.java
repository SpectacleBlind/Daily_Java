import java.util.ArrayList;


class Solution {
    public int[] solution(int n, long k) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[n];
        long fn = 1;
        
        for(int i = 1; i<=n; i++){
            arr.add(i); //1~n 까지 넣기   1~3
            fn *= i; // 팩토리얼 6
        }
        k--; // 5 -> 4
        
        int idx = 0;
        while (n>0){
            fn /=n; // 2
            ans[idx++] = arr.get((int) (k/fn)); //2
            arr.remove((int) (k/fn)); //2
            k %= fn; // 
            n--;
        }
        
        return ans;
}
}