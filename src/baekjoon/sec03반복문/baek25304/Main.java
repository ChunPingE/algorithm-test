package baekjoon.sec03반복문.baek25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		
		//X * N = 
		for (int i =0 ; i < N ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += (a * b);
			

		}
		if(X == sum ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
			
			
		

	}

}

