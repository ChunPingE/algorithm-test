package programmers.d20230226;

public class lv1가운데글자가져오기 {
	public static String solution(String s) {
		String answer = "";
		// 홀수라면? 인덱스가 0부터 시작 n / 2
		// 짝수라면? 4자리면 1~2 
		int len = s.length();
		if (len % 2 == 0) {
			answer = s.substring(len / 2 - 1, len / 2+1);
		} else {
			answer = s.substring(len / 2, len / 2 + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("qwer"));
	}

}
