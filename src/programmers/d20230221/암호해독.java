package programmers.d20230221;

public class 암호해독 {
	public String solution(String cipher, int code) {
		//cipher문자열의 index를 1부터시작해서 각 배수를 가져옴
		//for문은 i가 그 배수일때마다 값을 누적하는 코드를 작성
		//실제로 그 index는 i-1번째니 charAt(i - 1)을 해준다.
		//ex) 2번째문자(index는 0부터니 실제로는 1번)
		String answer = "";
		for (int i = 1; i <= cipher.length(); i++) {
			if (i % code == 0) {
				answer += cipher.charAt(i - 1);
			}
		}
		
		/*
		강사님의 풀이 
		code부터시작해서 code를 증감하는 식
		if연산을 안해도되니 더빠를듯
		for (int i = code; i <= cipher.length(); i += code) {
				answer += cipher.charAt(i - 1);
		}
		*/
		return answer;
	}
}
