package baekjoon.d20230306.baek2581;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 10000;

		f1: for (int i = m; i <= n; i++) {
			if (i == 1) {
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue f1;
				}
			}
			sum += i;
			if (i < min) {
				min = i;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
