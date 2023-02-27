package programmers.d20230226;

public class lv1없는숫자더하기 {
	public static int solution(int[] numbers) {
		int answer = 0;
		int sum = 0;

		int total = 9 * 10 / 2;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		answer = total - sum;
		return answer;
	}

	public static void main(String[] args) {
		solution(new int[] { 1, 2, 3, 4, 6, 7, 8, 0 });
	}

}
