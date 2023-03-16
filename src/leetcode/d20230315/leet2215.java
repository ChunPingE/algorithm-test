package leetcode.d20230315;

import java.util.*;

public class leet2215 {

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		// 코드 작성
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
			set1.remove(num);
		}

		for (int num : nums1) {
			set2.remove(num);
		}

		List<List<Integer>> answer = new ArrayList<>();
		answer.add(new ArrayList<>(set1));
		answer.add(new ArrayList<>(set2));
		return answer;
	}

	public static void main(String[] args) {
		findDifference(new int[] { 1, 2, 3 }, new int[] { 2, 4, 6 });
	}
}
