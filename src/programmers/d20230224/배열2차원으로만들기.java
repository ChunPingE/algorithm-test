package programmers.d20230224;

import java.util.Arrays;

public class 배열2차원으로만들기 {
	public static int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length / n][n];

		for (int i = 0; i < answer.length; i++) {
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = num_list[i * n + j];
			}
			answer[i] = arr;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[][] arr = solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 2);
		System.out.println(Arrays.deepToString(arr));
	}
}
