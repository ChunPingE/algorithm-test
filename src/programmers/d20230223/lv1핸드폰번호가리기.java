package programmers.d20230223;

public class lv1핸드폰번호가리기 {
	public String solution(String phone_number) {
		String answer = "";
		String[] arr = phone_number.split("");
		for (int i = 0; i < phone_number.length(); i++) {
			if (i < phone_number.length() - 4) {
				arr[i] = "*";
				answer += arr[i];
			} else {
				answer += arr[i];
			}
		}
		return answer;
	}
}
