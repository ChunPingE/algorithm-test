package baekjoon.d20230305.baek10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(pabo(n));
	}

	public static int pabo(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		// 5 4 + 3 3 + / 2 2 1 1 1
		return pabo(num - 1) + pabo(num - 2);
	}
}
