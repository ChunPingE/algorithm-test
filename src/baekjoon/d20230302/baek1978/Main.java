package baekjoon.d20230302.baek1978;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number;
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			number = sc.nextInt();
			for (int p = 2; p <= number; p++) {
				if (p == number) {
					cnt++;
				}
				if (number % p == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}