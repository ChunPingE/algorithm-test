package programmers.d20230224;

public class 주사위의개수 {
	public int solution(int[] box, int n) {
		int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);

		return answer;
	}
}
