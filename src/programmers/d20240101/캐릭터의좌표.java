package programmers.d20240101;

public class 캐릭터의좌표 {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };
		for (String s : keyinput) {
			switch (s) {
			case "up" -> {
				if (answer[1] >= board[1] / 2) {
					continue;
				}
				answer[1] += 1;
			}
			case "down" -> {
				if (answer[1] <= -(board[1] / 2)) {
					continue;
				}
				answer[1] -= 1;
			}
			case "right" -> {
				if (answer[0] >= board[0] / 2) {
					continue;
				}
				answer[0] += 1;
			}
			case "left" -> {
				if (answer[0] <= -(board[0] / 2)) {
					continue;
				}
				answer[0] -= 1;
			}
			}
		}
		return answer;
	}
}
