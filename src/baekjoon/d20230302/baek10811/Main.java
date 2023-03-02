package baekjoon.d20230302.baek10811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 바구니 뒤집기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(); // 1 0 ~ 1
			int b = sc.nextInt(); // 2
			int len = b - a + 1;
			int[] arr2 = new int[len];
			System.arraycopy(arr, a - 1, arr2, 0, len);
			// 0 1 / 2-1-0 2 2-1-1 0
			for (int j = a, k = 0; j <= b; j++, k++) {
				arr[j - 1] = arr2[arr2.length - 1 - k];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
