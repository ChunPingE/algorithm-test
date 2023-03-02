package baekjoon.d20230302.baek10810;

import java.util.Scanner;

public class Main {
	//공넣기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			for (int j = a; j <= b; j++) {
				arr[j - 1] = c;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
