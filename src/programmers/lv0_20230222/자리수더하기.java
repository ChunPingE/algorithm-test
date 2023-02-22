package programmers.lv0_20230222;

public class 자리수더하기 {

	public static int solution(int n) {
		int answer = 0;
		int num = String.valueOf(n).length();
//		for (int i = 0; i < num; i++) {
//			answer += n % 10;
//			n = n / 10;
//		}
		while (n>0) {
			answer += n % 10;
			n = n / 10;
		}

		return answer;
	}
	

	public static void main(String[] args) {
		System.out.println(solution(1234));
	}
}


