package programmers.d20230224;

import java.util.Arrays;

public class lv1제일작은수제거하기 {

	public static int[] solution(int[] arr) {
		int[] answer = null;
		int min = arr[0];

		for (int n : arr) {
			if (n < min) {
				min = n;
			}
		}

		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arr.length - 1];

			int index = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == min) {
					continue;
				}
				answer[index++] = arr[i];

			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = solution(new int[] { 4, 3, 2, 1 });
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
