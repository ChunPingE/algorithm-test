package CodingBat.Array_2;

public class bigDiff {
	public int bigDiff(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int n : nums) {
			max = Math.max(max, n);
			min = Math.min(min, n);
		}

		return max - min;
	}
}
