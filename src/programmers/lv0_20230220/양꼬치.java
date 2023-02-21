package programmers.lv0_20230220;

public class 양꼬치 {
	public int solution(int n, int k) {
		int answer = 0;
		answer = 12000 * n + k * 2000 - 2000 * (n / 10);
		return answer;
	}
}
