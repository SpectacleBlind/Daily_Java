import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
int count = 0;
ArrayList<Integer> List = new ArrayList<Integer>();

for(int i = 0; i<nums.length-2; i++){   
    for(int j = i+1; j < nums.length-1; j++){
        for(int k = j+1; k < nums.length; k++){
            list.add(nums[i]+nums[j]+nums[k]);
        }
    }
}
        
        
            
            if(sum%2 != 0) {
                int l = 6;
                int temp = 0;
                while(l < sum){
                    if(sum%l == 0){
                        temp++;
                        break;
                    }
                    l++;
                }
                if(temp == 0){
                      count++;
                }
             
            }
        }
    }
}
        return count;
    }
}



class Solution {
    public int solution(int[] nums) {



for(int i = 0; i<nums.length-2; i++){
    int count = 0;
    int temp = 0;
    for(int j = i+1; j < nums.length-1; j++){
        for(int k = j+1; k < nums.length; k++){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum%2 != 0) {
                for(int l = 6; l < sum; l++){
                    int cal = sum%l;
                    if(cal == 0) {
                        temp++; 
                }}
                if(temp == 0) 
                {count++;}
            }
        }
    }
}
        return count;
    }
}


import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
int answer = 0;
ArrayList<Integer> list = new ArrayList<Integer>();

for(int i = 0; i<nums.length-2; i++){   
    for(int j = i+1; j < nums.length-1; j++){
        for(int k = j+1; k < nums.length; k++){
            list.add(nums[i]+nums[j]+nums[k]);
        }
    }
}
        
for(int i : list){
    int count = 2;
    answer++;
        while(count < i){
            if(i%count == 0){
                answer--;
                break;
            }
            count++;
        }
}
    return answer;
    }}


