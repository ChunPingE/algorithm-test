package programmers.d20230220;

public class 게임369 {
	public int solution1(int order) {
		int answer = 0;
		// 3 6 9가 포함되어있다면 박수
		String str = String.valueOf(order);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
				answer++;
			}
		}
		return answer;
	}


	public int solution2(int order) {
		int answer = 0;
		int count = 0;
		while (order != 0) {
			if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
				count++;
			}
			order = order / 10; //10으로 나눠서 점점 줄어듬 몫이 0이면 더이상나눌게없게 된 것임.
		}
		answer = count;
		return answer;
	}

}
