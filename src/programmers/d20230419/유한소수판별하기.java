package programmers.d20230419;

public class 유한소수판별하기 {
	public int solution(int a, int b) {
		// 유한소수 : 소수점 아래 숫자가 계속되지 않고 유한개인 소수
		int newB = b / gcd(a, b);

		while (newB > 1) {
			if (newB % 2 == 0) {
				newB /= 2;
			} else if (newB % 5 == 0) {
				newB /= 5;
			} else {
				return 2;
			}
		}
		return 1;
	}
	
	//기약분수 만들기 4 5 / 5 1 / 1 0
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
