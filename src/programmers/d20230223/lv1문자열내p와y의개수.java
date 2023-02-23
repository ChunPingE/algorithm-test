package programmers.d20230223;

public class lv1문자열내p와y의개수 {
	boolean solution(String s) {
		boolean answer = true;
		int pcnt = 0;
		int ycnt = 0;
		String str = s.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'p') {
				pcnt++;
			} else if (c == 'y') {
				ycnt++;
			}
		}
		if (pcnt == ycnt) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
}
