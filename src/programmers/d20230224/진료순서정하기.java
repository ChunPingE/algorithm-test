package programmers.d20230224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 진료순서정하기 {
	public static int[] solution2(int[] emergency) {
		int[] answer = new int[emergency.length];

		int[] arr = Arrays.copyOf(emergency, emergency.length);

		Arrays.sort(emergency);

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == emergency[j]) {
					answer[i] = emergency.length - j;
				}
			}
		}
		return answer;
	}

	public static int[] solution(int[] emergency) {
		List<Integer> list = new ArrayList<>();
		for (int t : emergency) {
			list.add(t);
		}
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		int[] answer = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			answer[i] = list.indexOf(emergency[i]) +1 ;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = solution(new int[] { 3, 76, 24 });
		System.out.println(Arrays.toString(arr));
		// 3 1 2
	}
}
