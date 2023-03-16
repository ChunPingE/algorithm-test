package leetcode.d20230315;

import java.util.*;

public class leet2215T {

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		// 코드 작성
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(e-> set2.contains(e));
		list2.removeIf(e-> set1.contains(e));
		
		return List.of(list1, list2);
	}

	public static void main(String[] args) {
		findDifference(new int[] { 1, 2, 3 }, new int[] { 2, 4, 6 });
	}
}
