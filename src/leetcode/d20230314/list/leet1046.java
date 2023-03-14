package leetcode.d20230314.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leet1046 {
	// Last Stone Weight
	public static int lastStoneWeight(int[] stones) {
		List<Integer> list = new ArrayList<>();
		for (Integer stone : stones) {
			list.add(stone);
		}

		if (stones.length == 1) {
			return stones[0];
		}

		while (list.size() > 1) {
			Collections.sort(list);
			int x = list.get(list.size() - 2);
			int y = list.get(list.size() - 1);

			if (list.size() == 2 && x == y) {
				return 0;
			}

			list.remove(list.size() - 1);
			list.remove(list.size() - 1);
			if (x != y) {
				y = y - x;
				list.add(y);
			}
		}
		return list.get(0);
	}

	public static void main(String[] args) {

		int result = lastStoneWeight(new int[] { 9, 3, 2, 10 });
		System.out.println(result);
	}
}
