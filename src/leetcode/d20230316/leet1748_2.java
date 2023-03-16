package leetcode.d20230316;

public class leet1748_2 {
	public static int sumOfUnique(int[] nums) {
		// Sum of Unique Elements
		int sum = 0;

		int[] arr = new int[101];
		for (int n : nums) {
			arr[n] += 1;
		}

		for (int n : nums) {
			if (arr[n] == 1) {
				sum += n;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		sumOfUnique(new int[] { 1, 1, 1, 1, 1 });
	}

}
