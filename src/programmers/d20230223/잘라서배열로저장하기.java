package programmers.d20230223;

public class 잘라서배열로저장하기 {
	public static String[] solution(String my_str, int n) {
		int len = 0;
		int k = 0;
		String str = "";

		if (my_str.length() % n == 0) {
			len = my_str.length() / n;
		} else {
			len = my_str.length() / n + 1;
		}

		String[] answer = new String[len];

		for (int i = 0, count = 0; i < len; i++, count += n) {
			if (count + n > my_str.length()) {
				str = my_str.substring(count);
			} else {
				str = my_str.substring(count, count + n);// 0~6 6 12
			}
			answer[i] = str;
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] strArr = solution("abcdef123", 3);
		for(String s : strArr) {
			System.out.println(s);
		}
	}
}
