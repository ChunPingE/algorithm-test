package programmers.d20230223;

public class lv1콜라츠추측 {

	public static int solution(long num) {
		int answer = 0;

		if (num == 1) {
			return 0;
		}

		while (true) {
			if (num == 1) {
				break;
			} else if (answer == 500) {
				return -1;
			}
			if (num % 2 == 0) {
				num = num / 2;
				answer++;
			} else {
				num = num * 3 + 1;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(626331));
	}

}
