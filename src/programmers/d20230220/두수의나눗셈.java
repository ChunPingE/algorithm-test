package programmers.d20230220;

public class 두수의나눗셈 {

	public int solution(int num1, int num2) {
		double num3 = (double) num1 / num2 * 1000;
		int answer = (int) num3;
		System.out.println(num3);
		return answer;
	}

}
