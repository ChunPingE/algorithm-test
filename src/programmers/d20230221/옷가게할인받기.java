package programmers.d20230221;

public class 옷가게할인받기 {

	public static int solution(int price) {
		int answer = 0;
		if (price >= 500000) {
			// price - price *0.2 = price(1-0.2)
			answer = (int) (price * 0.8);
		} else if (price >= 300000) {
			// price - price *0.1 = price(1-0.1)
			answer = (int) (price * 0.9);
		} else if (price >= 100000) {
			// price - price * 0.05 = price(1-0.05)
			answer = (int) (price * 0.95);
		} else {
			answer = price;
		}
		return answer;
	}

	public static void main(String[] args) {

		solution(500000);
		System.out.println(solution(500000));
	}

}
