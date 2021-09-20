import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
      String [] array = s.split("");
      // 문자열로 받은 것 Array 화 -> 한칸씩 Split
      Arrays.sort(array,Collections.reverseOrder());
      // 오름차순 정렬, Collections 함께 import 하여 Reverse Order로 정렬 진행
      return String.join("",array);
      //각 Array를 하나의 문자열로!
    }
}