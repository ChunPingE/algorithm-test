package programmers.d20230418;

import java.util.*;
import java.util.stream.*;

public class 같은숫자는싫어 {

	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList();
		int num = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				num = arr[i];
				list.add(arr[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
