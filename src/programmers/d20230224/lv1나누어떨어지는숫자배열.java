package programmers.d20230224;

import java.util.Arrays;

public class lv1나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
		int[] answer;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		answer = new int[count];
		
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[index] = arr[i];
				index++;
			}
		}
		
		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {5,9,7,10}, 5));	
	}

}
