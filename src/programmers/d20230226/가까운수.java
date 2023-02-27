package programmers.d20230226;

import java.util.Arrays;

public class 가까운수 {
	public static int solution(int[] array, int n) {
		int answer = 0;
		// n - x 절댓값이 가장 작은 수
		int close = Math.abs(n - array[0]);

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(n - array[array.length - i - 1]) <= close) {
				close = Math.abs(n - array[array.length - i - 1]);
				answer = array[array.length - i - 1];
			}
		}

		return answer;
	}

	public static void main(String[] args) {

	}

}
