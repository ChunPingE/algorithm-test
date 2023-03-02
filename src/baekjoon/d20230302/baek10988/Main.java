package baekjoon.d20230302.baek10988;

import java.util.Scanner;

public class Main {
	//팰린드롬인지 확인하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 = new StringBuilder(str).reverse().toString();
		
		if(str.equals(str2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
