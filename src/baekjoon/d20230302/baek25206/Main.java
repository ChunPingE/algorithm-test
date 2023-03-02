package baekjoon.d20230302.baek25206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	// 너의 평점은
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);

		double total = 0;
		double num3 = 0;

		for (int i = 0; i < 20; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			if (arr[2].equals("P")) {
				continue;
			} else {
				if(map.containsKey(arr[2])) {
					double num1 = Double.parseDouble(arr[1]);
					double num2 = map.get(arr[2]);
					total += num1 * num2;
					num3 += num1;
				}
			}
		}
		double avg = total / num3;
		System.out.println(avg);
	}
}
