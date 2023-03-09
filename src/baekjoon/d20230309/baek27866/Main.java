package baekjoon.d20230309.baek27866;

import java.util.Scanner;

public class Main {
//문자와 문자열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int i = sc.nextInt();
		
		System.out.println(s.charAt(i-1));
	}
}
