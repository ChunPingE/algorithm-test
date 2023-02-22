package programmers.lv0_20230222;

import java.util.Arrays;

public class 중앙값구하기 {

	public int solution(int[] array) {
		int answer = 0;
		int num = array.length / 2;
		Arrays.sort(array);
		answer = array[num];
		return answer;
		 
	}
}
