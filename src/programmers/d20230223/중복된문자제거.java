package programmers.d20230223;

public class 중복된문자제거 {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			String a = "";
			if (!answer.contains(a + c)) {
				answer += "" + c;
			}

		}
		return answer;
	}

}
