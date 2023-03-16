package leetcode.d20230316;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class leet2206_2 {
	public boolean divideArray(int[] nums) {
		//Divide Array Into Equal Pairs
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int n : nums) {
			map.putIfAbsent(n, 0);
			int oldValue = map.get(n);
			map.replace(n, oldValue + 1);
		}

		// value가 홀수 인게 잇으면 return false
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
