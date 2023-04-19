package programmers.d20230419;

import java.util.*;

public class 예산 {
	// 오름차순 정리
	// 가장 작은값부터 넣어야 최대한 많은 팀지원할것이다.
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				break;
			}
			answer++;
		}
		return answer;
	}
}
