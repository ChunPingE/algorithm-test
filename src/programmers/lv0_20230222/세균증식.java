package programmers.lv0_20230222;

public class 세균증식 {
	public int solution(int n, int t) {
		int answer = 0;
		for (int i = 0; i < t; i++) {
			n *= 2;
			answer = n;
		}
		return answer;
	}

}
