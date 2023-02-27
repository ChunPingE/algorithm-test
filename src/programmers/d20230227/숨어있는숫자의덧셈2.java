package programmers.d20230227;

import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {
	public static int solution(String my_string) {
		int answer = 0;
		String[] arr = my_string.split("[a-zA-z]+");

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("[0-9]+")) {
				answer += Integer.parseInt(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		solution("aAb1B2cC34oOp");
	}

}
