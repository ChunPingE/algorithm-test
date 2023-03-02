package baekjoon.d20230302.baek1920;

import java.util.Scanner;

public class Main2 {
	// 수 찾기
	// 메모리 초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String str1 = "";

		for (int i = 0; i < n; i++) {
			str1 += String.valueOf(sc.nextInt());
		}

		int m = sc.nextInt();

		String[] arr1 = new String[m];

		for (int i = 0; i < m; i++) {
			arr1[i] = String.valueOf(sc.nextInt());
		}

		for (int i = 0; i < arr1.length; i++) {
			if (str1.contains(arr1[i])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}

