package leetcode.d20230316;

public class leet2006 {
	//Count Number of Pairs With Absolute Difference K
	public int countKDifference(int[] nums, int k) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int v = Math.abs(nums[i] - nums[j]);
				if (v == k) {
					count++;
				}
			}
		}
		return count;
	}
}
