package sec03.baek2442;

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

	}

}
