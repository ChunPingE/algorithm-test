package baekjoon.d20230306.baek2581;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 10000;

		x: for (int i = m; i <= n; i++) { 
			if (i == 1) { 
				continue;
			}
			for (int j = 2; j < i; j++) { 
				// 2~i-1까지의 수랑 i랑 나눠서 나머지가 0이면 소수가 아니므로 for문 스킵.
				if (i % j == 0) {
					continue x;
				}
			}
			sum += i;
			if (min > i) {
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
