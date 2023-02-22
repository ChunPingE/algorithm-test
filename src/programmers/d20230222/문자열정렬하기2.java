package programmers.d20230222;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public String solution(String my_string) {
		String answer = "";
		String str = my_string.toLowerCase();
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		answer = new String(chars);

		return answer;
	}
}
