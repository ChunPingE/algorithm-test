package leetcode.d20230314.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet2089 {
	// Find Target Indices After Sorting Array
	public List<Integer> targetIndices(int[] nums, int target) {
		Arrays.sort(nums);
		 List<Integer> list = new ArrayList<>();
		 
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				list.add(i);
			}
		}
		return list;
	}
}
