package programmers.d20230228;

public class 치킨쿠폰 {
	public int solution(int chicken) {
		int answer = -1;
		int coupon = chicken;
		
		int order = 0;
		
		while (coupon>= 10) {
			int leftCoupon = coupon % 10;
			order += coupon / 10;
			coupon = leftCoupon + coupon / 10;
		}
		answer = order;
		
		return answer;
	}
}
