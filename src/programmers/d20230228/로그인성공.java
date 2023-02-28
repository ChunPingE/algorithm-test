package programmers.d20230228;

import java.util.HashMap;
import java.util.Map;

public class 로그인성공 {
	public String solution2(String[] id_pw, String[][] db) {
		String answer = "";
		for (int i = 0; i < db.length; i++) {
			if (id_pw[0].equals(db[i][0])) {
				if (id_pw[1].equals(db[i][1])) {
					answer = "login";
					break;
				} else {
					answer = "wrong pw";
					break;
				}
			} else {
				answer = "fail";
			}
		}
		return answer;
	}

	public static String solution(String[] id_pw, String[][] db) {
		String answer = "";
		Map<String, String> map = new HashMap<>();
		for (String[] str : db) {
			map.put(str[0], str[1]);
		}
		if (map.containsKey(id_pw[0])) {
			if (map.get(id_pw[0]).equals(id_pw[1])) {
				answer = "login";
			} else {
				answer = "wrong pw";
			}
		} else {
			answer = "fail";
		}

		return answer;
	}

	public static void main(String[] args) {
		solution(new String[] { "1", "2" }, new String[][] { { "1", "2" }, { "3", "4" } });
	}

}
