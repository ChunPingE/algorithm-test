package baekjoon.d20230308.시간복잡도.beak24267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long n = Long.parseLong(br.readLine());

		int sum = 0;
		for (int i = 1; i <= n - 2; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				for (int k = j + 1; k <= n; k++) {
					sum = sum + i * j * k;
				}
			}
		}
		//1~ n-2번 /  n-1 번 / n번 / 6
		System.out.println(n*(n-1)*(n-2));
		System.out.println(3);
	}
}
