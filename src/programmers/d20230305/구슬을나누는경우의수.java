package programmers.d20230305;

public class 구슬을나누는경우의수 {
	public static int comb(int balls, int share) {
		if (balls == share || share == 0) {
			return 1;
		}
		// ncr = n-1cr + n-1cr-1
		return comb(balls - 1, share - 1) + comb(balls - 1, share);
	}

	public int solution(int balls, int share) {
		int answer = comb(balls, share);
		return answer;
	}
}
