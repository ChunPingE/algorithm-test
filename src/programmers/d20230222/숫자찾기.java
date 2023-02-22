package programmers.d20230222;

public class 숫자찾기 {
	public static int solution(int num, int k) {
		int answer = 0;
		String str1 = String.valueOf(num);
		String str2 = String.valueOf(k);

		if (str1.contains(str2)) {
			answer = str1.indexOf(str2) + 1;
		} else {
			answer = -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(29183, 1));
	}

}
