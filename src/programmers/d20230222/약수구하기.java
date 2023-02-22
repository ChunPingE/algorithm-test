package programmers.d20230222;

public class 약수구하기 {
	public int[] solution(int n) {

		int count = 0;
		int index = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		int[] answer = new int[count];
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[index] = i;
				index++;
			}
		}

		return answer;
	}
}
