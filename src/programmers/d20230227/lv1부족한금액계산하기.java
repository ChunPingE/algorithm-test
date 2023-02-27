package programmers.d20230227;

public class lv1부족한금액계산하기 {
	public static long solution(int price, int money, int count) {
		long answer = -1;
		// 1번 price 2번 2*price count*price
		long pay = 0;
		for (int i = 1; i <= count; i++) {
			pay += (long) (i * price);
		}
		 pay = (long) price * (count * (1 + count) / 2);
		// 1price 2price 3price
		//price(1+2+3) count * (1+ count) / 2
		
		System.out.println(pay);
		
		if (pay > money) {
			answer = pay - money;
		} else {
			answer = 0;
		}

		return answer;
	}

	public static void main(String[] args) {
		solution(10000000, 100, 5);
	}

}
