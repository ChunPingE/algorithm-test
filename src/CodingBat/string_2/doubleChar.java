package CodingBat.string_2;

public class doubleChar {
	public String doubleChar(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(i);
			answer += str.charAt(i);

			// answer += str.substring(i, i+1);
			// answer += str.substring(i, i+1);
		}
		return answer;
	}
}
