package sec01.baek3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int look = sc.nextInt();
		int bi = sc.nextInt();
		int knight = sc.nextInt();
		int pon = sc.nextInt();
	
		System.out.print(1 - king + " ");
		System.out.print( 1 - queen + " ");
		System.out.print(2 - look + " ");
		System.out.print( 2- bi + " ");	
		System.out.print(2 - knight + " ");
		System.out.print(8 - pon + " " );
		
		
		
		
	}

}
