import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i = 0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}

//Sort 하는게 결국 시간이 더 걸린다고 하는데, 더 빨리 할 수 있는거 있는지 확인 필요