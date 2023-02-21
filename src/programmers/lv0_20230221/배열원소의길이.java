package programmers.lv0_20230221;

public class 배열원소의길이 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < strlist.length; i++) {
			String str = strlist[i];
			answer[i] = str.length();
		}
		return answer;
	}
}
