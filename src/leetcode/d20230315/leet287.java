package leetcode.d20230315;

import java.util.HashSet;
import java.util.Set;

public class leet287 {
	public int findDuplicate(int[] nums) {

		int answer = 0;
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i])) {
				answer = nums[i];
				break;
			}
		}

		return answer;
	}
}
