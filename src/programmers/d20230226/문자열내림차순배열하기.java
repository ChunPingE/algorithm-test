package programmers.d20230226;

import java.util.Arrays;

public class 문자열내림차순배열하기 {
	public String solution(String s) {
		String answer = "";

		String[] strArr = s.split("");

		Arrays.sort(strArr);

		int len = strArr.length;

		String[] newArr = new String[len];

		for (int i = 0; i < len; i++) {
			newArr[i] = strArr[len - 1 - i];
			answer += newArr[i];
		}

		return answer;
	}

	public String reverseStr(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}
}
