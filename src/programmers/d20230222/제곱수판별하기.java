package programmers.d20230222;

public class 제곱수판별하기 {
	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (i * i == n) {
				answer = 1;
				break;
			} else {
				answer = 2;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(144));
	}
}
