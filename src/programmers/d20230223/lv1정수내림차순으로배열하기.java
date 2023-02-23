package programmers.d20230223;

import java.util.Arrays;

public class lv1정수내림차순으로배열하기 {
	public static long solution(long n) {
		String str1 = String.valueOf(n);
		long[] arr = new long[str1.length()];
		int i = 0;
		while (n > 0) {
			arr[i] = n % 10;
			n = n / 10;
			i++;
		}
		Arrays.sort(arr);
		String str = "";
		for (int j = 0; j < arr.length; j++) {
			str += arr[arr.length - j - 1];
		}

		long answer = Long.parseLong(str);
		return answer;
	}

	public static void main(String[] args) {
		solution(12345);

	}
}
