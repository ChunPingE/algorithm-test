package baekjoon.sec06문자열.baek2908;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		String a  = new StringBuilder().append(A).reverse().toString();
		String b = new StringBuilder().append(B).reverse().toString();

		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);

		if (a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);
		}
		/*
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String a = new StringBuilder().append(A).reverse().toString();
		String b = new StringBuilder().append(B).reverse().toString();

		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		if (a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);
		}
		
	*/
	
		
		
	}

}

