package baekjoon.sec03반복문.baek2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0 ; i< T ; i++) {
			for(int j = i ; j < T - 1   ; j ++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i*2 + 1  ; k++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
		for (int i = 0 ; i< T ; i++) {
			for(int j = 0 ; j <= i ; j ++) {
				System.out.print(" ");
			}
			for(int k = i ; k < (T*2) - (i+3) ; k++) {
				System.out.print("*");
			}
			
		System.out.println();
		}

	}

}
