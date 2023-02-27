package programmers.d20230227;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {
	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();

		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				if (!list.contains(i)) {
					list.add(i);
				}
				n = n / i;
			} else {
				i++;
			}
		}

		int[] answer = new int[list.size()];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = list.get(j);
		}

		return answer;
	}
}
