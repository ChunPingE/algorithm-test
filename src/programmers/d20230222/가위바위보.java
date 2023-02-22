package programmers.d20230222;

public class 가위바위보 {
	public String solution(String rsp) {
		String answer = "";
		String[] arr = rsp.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("2")) {
				arr[i] = "0";
			} else if (arr[i].equals("0")) {
				arr[i] = "5";
			} else if (arr[i].equals("5")) {
				arr[i] = "2";
			}
			answer += arr[i];

		}
		return answer;
	}
}
