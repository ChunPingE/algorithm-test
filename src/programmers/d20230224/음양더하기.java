package programmers.d20230224;

public class 음양더하기 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == true) {
				answer += absolutes[i];
			} else {
				answer += -1 * absolutes[i];
			}
		}
		return answer;
	}
}
