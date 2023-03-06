package baekjoon.d20230306.baek10812;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] rot = new int[n + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int begin = sc.nextInt();
			int end = sc.nextInt();
			int mid = sc.nextInt();

			for (int j = 0; j < end - mid + 1; j++) {
				rot[begin + j] = arr[mid + j];
			}
			for (int j = 0; j < mid - begin; j++) {
				rot[begin + end - mid + 1 + j] = arr[begin + j];
			}
			for (int j = begin; j <= end; j++) {
				arr[j] = rot[j];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}