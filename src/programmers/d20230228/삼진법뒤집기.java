package programmers.d20230228;

public class 삼진법뒤집기 {
	public int solution(int n) {
		int answer = 0;
		String str = Integer.toString(n, 3);
		StringBuilder sb = new StringBuilder(str);
		String an = sb.reverse().toString();
		answer = Integer.parseInt(an, 3);
		return answer;
	}
}
