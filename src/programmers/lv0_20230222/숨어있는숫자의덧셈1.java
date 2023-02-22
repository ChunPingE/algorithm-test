package programmers.lv0_20230222;

public class 숨어있는숫자의덧셈1 {

	public int solution(String my_string) {
		int answer = 0;
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (48 <= c && c <= 57) {
				answer += c - 48;
			}
		}

		return answer;
	}

}
