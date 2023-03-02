package baekjoon.d20230302.baek25314;

import java.util.Scanner;

public class Main {
	//코딩은체육과목입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int lo = n / 4;
		
		String str = "";
		
		for (int i = 0; i < lo; i++) {
			str += "long ";
		}
		
		str += "int";
		
		System.out.println(str);
	}
}
