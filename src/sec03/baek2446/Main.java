package sec03.baek2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0 ; i< T ; i++) {
			for(int j = 0  ; j < i  ; j ++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < T*2 - i*2- 1; j ++) {
				System.out.print("*");
			}
		System.out.println();
		}
		for (int i = 0 ; i< T -1 ; i++) {
			for(int j = i + 1 ; j < T -1; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < i*2+3  ; j ++) {
				System.out.print("*");
			}
			
		
		System.out.println();
		}
		
	}
}


