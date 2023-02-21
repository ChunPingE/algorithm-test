package programmers.lv0_20230221;

public class 배열자르기 {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		// System.arraycopy(원본배열, 원본배열 복사 시작인덱스, 새배열, 새배열 붙여넣기 사직인덱스, 복사 항목 수);
		System.arraycopy(numbers, num1, answer, 0, num2 - num1 + 1);
		return answer;
		// Arrays.copyOfRange(numbers, num1, num2 + 1)
	}
}
