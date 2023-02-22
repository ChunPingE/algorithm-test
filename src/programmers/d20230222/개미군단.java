package programmers.d20230222;

public class 개미군단 {
	public int solution(int hp) {
		// 장군 5 병정3 일개미1
		int answer = 0;
		int a = hp / 5;
		int b = (hp % 5) / 3;
		int c = ((hp % 5) % 3);
		answer = a + b + c;
		return answer;
	}

}
