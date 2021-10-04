/* 프로그래머스 Level 1 문제 풀이
   *. 신규 아이디 추천
       입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것
      - 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
      - 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
      - 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
      - 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
      - 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
      - 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
      - 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
       */

class Solution {
    public String solution(String new_id) {
        String answer = lv7(lv6(lv5(lv4(lv3(lv2(lv1(new_id)))))));
        return answer;
    }

public String lv1(String new_id){
         new_id = new_id.toLowerCase();
         return new_id;
}
    
public String lv2(String new_id){
		String id = "";
		for(int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			} else if(ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			} else if(ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}
 return id;
}

public String lv3 (String new_id){
 new_id = new_id.replace("...",".");
 new_id = new_id.replace("..",".");
 return new_id;
}

public String lv4 (String new_id){
    int length = new_id.length();
        if(new_id.startsWith(".") ) {
			new_id = new_id.substring(1, new_id.length());
		} else if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length()-1);
		}    return new_id;
}


public String lv5 (String new_id){
    if (new_id.length() == 0) new_id = "a";
    return new_id;
}

public String lv6 (String new_id){
    int length = new_id.length();
    if(length > 15)  new_id = new_id.substring(0,15);     
    if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, 14);  
    }
         return new_id;
}



public String lv7(String new_id){    

    int length = new_id.length();
if(length <=2){
    for(int i = 0 ; i < 3-length ; i++){
       new_id += new_id.charAt(length-1); 
    } 
}
return new_id;
    }
}
    


// 결국 실패율 50%.. 뭐가 문제 였을지 확인 필요!!!
		
//다른사람의 풀이 정규식 풀이 - class Solution {
public String solution(String new_id) {
    String id = new_id.toLowerCase(); // 소문자로 
    id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김 
    id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 
    id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거 

    if(id.equals("")) // 빈 문자열이라면 a 추가 
        id += "a";
        
    if(id.length() >= 16){ // 16자 이상이면 15자로 
        id = id.substring(0, 15);
        id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거 
    }
    if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가 
        while(id.length() < 3)
            id += id.charAt(id.length() - 1);

    return id;
}
}


// 일반 형태 다른 구현
class Solution {
public String solution(String new_id) {
	// 1. 소문자로 변경
	new_id = new_id.toLowerCase();

	// 2. 소문자 숫자 -_. 제외한 모든 문자 제거 
	String id = "";
	for(int i = 0; i < new_id.length(); i++) {
		char ch = new_id.charAt(i);

		if(ch >= 'a' && ch <= 'z') {
			id += String.valueOf(ch);
		} else if(ch >= '0' && ch <= '9') {
			id += String.valueOf(ch);
		} else if(ch == '.' || ch == '-' || ch == '_') {
			id += String.valueOf(ch);
		}
	}

	// 3. . 하나만 
	for(int i = 0; i < id.length(); i++) {
		if(id.charAt(i) == '.') {
			int j = i+1;
			String dot = ".";

			while(j != id.length() && id.charAt(j) == '.') {
				dot += ".";
				j++;
			}

			if(dot.length() > 1)
				id = id.replace(dot, ".");
		}
	}

	// 4. 첫번째, 마지막 . 제거
	if(id.startsWith(".") ) {
		id = id.substring(1, id.length());
	} else if(id.endsWith(".")) {
		id = id.substring(0, id.length()-1);
	}

	// 5. 빈 문자열이라면 a 대입 
	if(id.length() == 0) {
		id += "a";
	}

	// 6. 16자 이상이면, 15자만 남김 
	if(id.length() >= 16) {
		id = id.substring(0, 15);
	}
    
	// 마지막 . 제거 
	if(id.endsWith(".")) {
		id = id.substring(0, id.length()-1);
	}

	// 7. 2자 이하라면, 마지막 문자 길이 3까지 반복해서 붙임 
	String last = id.charAt(id.length()-1) + "";
	if(id.length() == 2) {
		id = id + last;
	} else if(id.length() == 1) {
		id = id + last + last;
	}

	return id;
}
}