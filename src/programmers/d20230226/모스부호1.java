package programmers.d20230226;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {
	public static String solution(String letter) {
		String answer = "";
		Map<String, String> map = new HashMap<>();

		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
		
		String[] letterArr = letter.split(" ");
		for (int i = 0; i < letterArr.length; i++) {
			answer += map.get(letterArr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		solution(".... . .-.. .-.. ---");
	}

}
