package programmers.lv0_20230222;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	public int solution(int[] sides) {
		int answer = 0;
		Arrays.sort(sides);
		if (sides[2] < sides[1] + sides[0]) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}

}
