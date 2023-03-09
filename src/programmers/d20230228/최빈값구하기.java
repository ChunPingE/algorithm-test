package programmers.d20230228;

public class 최빈값구하기 {
	public int solution(int[] array) {
		int answer = 0;

		int[] index = new int[1001];
		int max = Integer.MIN_VALUE;
		
		//갯수세기
		for (int i = 0; i < array.length; i++) {
			index[array[i]]++;
		}
		
		for (int i = 0; i < index.length; i++) {
			if (max < index[i]) {
				max = index[i];
				answer = i;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < index.length; i++) {
			if (index[i] == max) {
				count++;
			}
		}
		if (count > 2) {
			answer = -1;
		}
		
		return answer;
	}

}
