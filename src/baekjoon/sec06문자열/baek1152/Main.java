package baekjoon.sec06문자열.baek1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] strArr = str.trim().split(" ");
		if (str.equals(" ")) {
			System.out.println(0);
		} else {
			System.out.println(strArr.length);
		}

		System.out.println(strArr.length);

		/*
		 * StringTokenizer st = new StringTokenizer(str, " ");
		 * 
		 * System.out.println(st.countTokens());
		 */
	}
}
