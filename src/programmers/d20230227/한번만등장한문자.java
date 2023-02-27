package programmers.d20230227;

import java.util.Arrays;

public class 한번만등장한문자 {
	public static String solution(String s) {
		String answer = "";

		// 소문자 배열
		int[] arr = new int[26];

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a'] += 1;
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer += (char) (i + 'a');
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		solution("abcabcadc");
	}
}
