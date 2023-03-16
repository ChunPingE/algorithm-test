package leetcode.d20230316;

public class leet1512 {
	public int numIdenticalPairs(int[] nums) {
		//Number of Good Pairs
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
