package programmers.d20230224;

import java.util.Arrays;

public class 컨트롤제트 {
	public static int solution(String s) {
		int answer = 0;
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i].equals("Z")) {
				answer += -1 * Integer.parseInt(arr[i-1]);
			} else {
				answer += Integer.parseInt(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int a = solution("-1 -2 -3 Z");
		System.out.println(a);
	}

}
