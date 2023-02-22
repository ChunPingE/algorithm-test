package programmers.d20230222;

public class 짝수는싫어요 {
	public int[] solution(int n) {
		int[] answer;
		int num = 0;
		if (n % 2 == 0) {
			answer = new int[n / 2];
		} else {
			answer = new int[n / 2 + 1];
		}

		for (int i = 1; i <= n; i += 2) {
			answer[num] = i;
			num++;
		}
		return answer;
	}
}
