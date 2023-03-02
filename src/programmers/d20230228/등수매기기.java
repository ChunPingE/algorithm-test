package programmers.d20230228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 등수매기기 {
	public static int[] solution(int[][] score) {
		List<Integer> scoreList = new ArrayList<>();
		for (int[] t : score) {
			scoreList.add(t[0] + t[1]);
		}
		System.out.println(scoreList);
		scoreList.sort(Comparator.reverseOrder());
		System.out.println(scoreList);

		int[] answer = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		solution(
				new int[][] { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } });

	}
}
