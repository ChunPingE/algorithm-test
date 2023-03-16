package leetcode.d20230315;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();

		Set<Integer> answer = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		for (int num : nums3) {
			set3.add(num);
		}

		for (Integer item : set1) {
			if (set2.contains(item)) {
				answer.add(item);
			} else if (set3.contains(item)) {
				answer.add(item);
			}
		}

		for (Integer item : set2) {
			if (set3.contains(item)) {
				answer.add(item);
			}
		}

		list.addAll(answer);

		return list;
	}

}
