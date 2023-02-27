package programmers.d20230226;

public class k의개수 {
	public static int solution(int i, int j, int k) {
		int answer = 0;

		String str = "";
		String a = String.valueOf(k);

		for (int l = i; l <= j; l++) {
			str += String.valueOf(l);
		}

		String[] arr = str.split("");

		for (int l = 0; l < arr.length; l++) {
			if (arr[l].equals(a)) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		solution(1, 13, 1);
	}

}
