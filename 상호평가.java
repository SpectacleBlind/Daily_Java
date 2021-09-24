class Solution {
    public String solution(int[][] scores) {
StringBuilder sb = new StringBuilder();

for(int i = 0; i < scores.length ; i++){
int sum = 0;
int length = scores.length;
int min = 101;
int max = -1;
int selfScore = scores[i][i];
boolean onlyOne = true;

    for (int j = 0; j <scores.length ; j++){
        min = Math.min(scores[j][i],min);
        max = Math.max(scores[j][i],max);
        
        if((j != i) && selfScore == scores[j][i] ){
            onlyOne = false;
        }
        sum += scores[j][i];
    }
    if (onlyOne && (max == selfScore || min == selfScore)) { 
        length -= 1; 
        sum -= selfScore;
    }
    sb.append(this.average(sum/length));
}
return sb.toString();
}

    
    public String average(int score){
        switch (score / 10) { 
            case 10: 
            case 9: 
                return "A"; 
            case 8: 
                return "B"; 
            case 7: 
                return "C"; 
            case 6: 
            case 5: 
                return "D"; 
            default: 
                return "F"; }

    }
        

}
//상호 평가 과제, Math 활용하여 min,max 적용, boolean 활용하여 중복 값 있는지 확인
//학점은 메소드 구분, 작성