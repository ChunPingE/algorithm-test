package programmers.d20230227;

public class 삼각형의완성조건2 {
	public int solution(int[] sides) {
		int answer = 0;
		// max = sides[0]일경우 sides[1]일경우 다른하나일경우
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);
		int maxSide = sides[0] + sides[1];

		for (int i = max + 1; i <= maxSide; i++) {
			answer++;
		}

		for (int i = max - min + 1; i <= max; i++) {
			answer++;
		}

		return answer;
	}
}
