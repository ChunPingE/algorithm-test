package programmers.lv0_20230221;

public class 피자나눠먹기1 {
	public int solution(int n) {
		int answer = 0;
		// n이 1~7이면 1 8~14면 2
		if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}
		return answer;
	}
}
