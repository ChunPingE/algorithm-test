package programmers.d20230226;

public class 이진수더하기 {
	public static String solution(String bin1, String bin2) {
		String answer = "";

		int x = Integer.parseInt(bin1, 2);
		int y = Integer.parseInt(bin2, 2);

		answer = Integer.toBinaryString(x + y);
		return answer;
	}

	public static void main(String[] args) {
		solution("10", "11");
	}

}
