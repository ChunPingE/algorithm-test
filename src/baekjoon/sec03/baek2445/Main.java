package baekjoon.sec03.baek2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0 ; i< T ; i++) {
			for(int j = 0 ; j <= i   ; j ++) {
				System.out.print("*");
			}
			for(int j = 0 ; j < T*2 - i*2 - 2  ; j ++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i   ; j ++) {
				System.out.print("*");
			}
		System.out.println();
		}
		for (int i = 0 ; i< T ; i++) {
			for(int j = i + 1 ; j < T   ; j ++) {
				System.out.print("*");
			}
			for(int j = 0 ; j < 2*i + 2  ; j ++) {
				System.out.print(" ");
			}
			for(int j = i + 1 ; j < T   ; j ++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}


