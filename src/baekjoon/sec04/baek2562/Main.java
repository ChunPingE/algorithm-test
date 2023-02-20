package baekjoon.sec04.baek2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int rst = 0;

		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max ) {
				max = arr[i];
				rst = i;
			}
		}
		System.out.printf("%s %s", max, rst+1);
	
		
		
		
		
	}

}

