package baekjoon.d20230302.baek10813;

import java.util.Scanner;

public class Main {
	// 공바꾸기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int temp = arr[a - 1];
			arr[a - 1] = arr[b - 1];
			arr[b - 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
