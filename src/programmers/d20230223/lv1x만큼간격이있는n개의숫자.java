package programmers.d20230223;

public class lv1x만큼간격이있는n개의숫자 {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		// 공차가 Math.abs(x) 개수가 n개
		// an=a+(n−1)d
		// answer[0] = x + 0 * x;
		// answer[1] = x + 1 *d

		for (int i = 1; i <= n; i++) {
			answer[i - 1] = x + (long) ((i - 1) * x);
		}
		return answer;
	}
}
