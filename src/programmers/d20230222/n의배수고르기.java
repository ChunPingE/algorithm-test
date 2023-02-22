package programmers.d20230222;

public class n의배수고르기 {
	public int[] solution(int n, int[] numlist) {

		int count = 0;
		int index = 0;

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			}
		}

		int[] answer = new int[count];
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[index] = numlist[i];
				index++;
			}
		}
		return answer;
	}

}
