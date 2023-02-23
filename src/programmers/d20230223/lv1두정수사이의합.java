package programmers.d20230223;

public class lv1두정수사이의합 {
	public long solution(long a, long b) {
		// 등차수열의 합 n * (첫항+마지막항)/2
		// 첫항 a 마지막항 b = 5-3+1
		long n = 0;
		if (a > b) {
			n = a - b + 1;
		} else {
			n = b - a + 1;
		}

		long answer = n * (a + b) / 2;
		return answer;
	}
}