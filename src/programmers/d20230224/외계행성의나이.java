package programmers.d20230224;

public class 외계행성의나이 {
	public String solution(int age) {
		String answer = "";
		String str = String.valueOf(age);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			answer += (char) (c + 49);
		}

		return answer;
	}
}
