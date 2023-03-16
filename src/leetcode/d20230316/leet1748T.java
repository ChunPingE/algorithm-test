package leetcode.d20230316;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class leet1748T {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		// 각 값이 몇개인 세는 코드
		for (int n : nums) {
			// 없으면 넣는 메소드
			map.putIfAbsent(n, 0);
			int oldValue = map.get(n);
			// 값 업데이트 하는 메소드
			map.replace(n, oldValue + 1);
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
