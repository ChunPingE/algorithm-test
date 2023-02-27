package programmers.d20230226;

public class lv1문자열다루기기본 {
 	public boolean solution(String s) {
		boolean answer = true;
		String str = s.replaceAll("[^0-9]", "");
		if (str.length() == s.length() && (s.length() == 4 || s.length() == 6)) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
}
