package baekjoon.d20231102.baek2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int a = (H*60) + M + C;
		//시간 : 시간 / 60
		//분 : 분 % 60
		H = a / 60;
		C = a % 60;
		
		if (H >= 24) {
			System.out.println(H - 24 + " " +  C);
		} else {
			System.out.println(H + " " + C);
		}
		
		
	
		
	
		
		
	
		
	}

}
