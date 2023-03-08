package programmers.d20230308;

public class 다항식더하기 {
	public static String solution(String polynomial) {
		String answer = "";
		String[] arr = polynomial.split(" ");
		int x = 0;
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].contains("+"))) {
				continue;
			}
			if (arr[i].equals("x")) {
				x += 1;
				continue;
			}
			if (arr[i].contains("x")) {
				String str = arr[i].replace("x", "");
				x += Integer.parseInt(str);
			} else {
				a += Integer.parseInt(arr[i]);
			}
		}
		
		String x1 = x > 0 ? x == 1 ? "x" : x + "x" : "";
		String a1 = a > 0 ? String.valueOf(a) : "";
		
		if (x > 0) {
			if (a > 0) answer += x1 + " + " + a1;
			else answer += x1;
		}
		else if (a > 0) answer += a1;
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("x + x + x"));
	}
}
