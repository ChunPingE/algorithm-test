package baekjoon.sec07.baek1712;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int  N = 0;
		if (C <= B) {
			N = -1;
		} else {
			N = (A/(C-B))+1;
		}
		
		System.out.println(N);
		
	}

}
