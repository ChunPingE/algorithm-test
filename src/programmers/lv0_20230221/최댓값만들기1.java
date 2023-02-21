package programmers.lv0_20230221;

public class 최댓값만들기1 {
	public int solution(int[] numbers) {
		int answer = numbers[0];
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				result = numbers[i] * numbers[j];
				if (numbers[i] == numbers[j]) {
					continue;
				} else if (result > answer) {
					answer = result;
				}
			}

		}
		return answer;
	}
}
