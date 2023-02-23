package programmers.d20230223;

public class lv1하샤드수 {
	public boolean solution(int x) {
		boolean answer = true;

		int sum = 0;
		int temp = x;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		if (x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}

}
