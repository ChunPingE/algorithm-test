package leetcode.d20230314.list;

import java.util.ArrayList;
import java.util.List;

public class leet1431 {
	// Kids With the Greatest Number of Candies
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> list = new ArrayList<>();

		int max = Integer.MIN_VALUE;
		for (int num : candies) {
			if (num > max) {
				max = num;
			}
		}

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}
}
