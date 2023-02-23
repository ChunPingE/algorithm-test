package programmers.d20230223;

public class lv1문자열을정수로바꾸기 {
	public int solution(String s) {
		int answer = 0;
		if (s.contains("-")) {
			String str = s.replace("-", "");
			answer = Integer.parseInt(str) * (-1);
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
}
