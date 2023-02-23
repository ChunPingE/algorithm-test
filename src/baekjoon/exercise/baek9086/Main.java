package baekjoon.exercise.baek9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < T; i++) {
			String str = sc.nextLine();
			
			char c1 = str.charAt(0);
			char c2 = str.charAt(str.length()-1);
			
			String result = c1 + "" + c2;
			System.out.println(result);
		}
		
		
	}
}
