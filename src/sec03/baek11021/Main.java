package sec03.baek11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1 ; i<= T ; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i , X, Y, X+Y);
		
		}

	}

}
