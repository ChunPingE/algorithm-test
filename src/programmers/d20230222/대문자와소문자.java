package programmers.d20230222;

public class 대문자와소문자 {
	public static String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				answer += (char) (c + 32);
			} else {
				answer += (char) (c - 32);
			}
		}
		return answer;
	}
    
	public static void main(String[] args) {
		solution("abAb");
	}

}
