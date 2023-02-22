package programmers.d20230222;

public class lv1짝수와홀수 {
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}
