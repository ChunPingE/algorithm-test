package programmers.d20230228;

public class 공던지기 {
	public int solution2(int[] numbers, int k) {
		int answer =  numbers[2 * (k - 1) % numbers.length];
		return answer;
		//한명을 건너띄고 던지므로 인덱스는 2 증가하고
		//첫번째에 공을 던지는 것은 항상 0번 인덱스이므로 (k-1) 이다.
	}
	
	public int solution(int[] numbers, int k) {
		//배열 길이가 무한다라고 생각하기
		int answer =  numbers[2 * (k - 1) % numbers.length];
		return answer;
		//한명을 건너띄고 던지므로 인덱스는 2 증가하고
		//첫번째에 공을 던지는 것은 항상 0번 인덱스이므로 (k-1) 이다.
	}

}
