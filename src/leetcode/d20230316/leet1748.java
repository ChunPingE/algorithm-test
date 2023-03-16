package leetcode.d20230316;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class leet1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		// 각 값이 몇개인 세는 코드
		for (int n : nums) {
			if (map.containsKey(n)) {
				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);
			} else {
				map.put(n, 1);
			}
		}

		int sum = 0;
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				sum += entry.getKey();
			}
		}
		return sum;
	}
	

}
