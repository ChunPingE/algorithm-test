package baekjoon.sec04.baek3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = 0;
	
		int rst = 0;
		int[] arr = new int[10];
		for (int i =0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for (int i =0 ; i < arr.length ; i++) {
			int count = 0;
			for (int j = i + 1 ; j < arr.length ; j++) {
				if ( arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				rst++;
			}
			
		}
		System.out.println(rst);
	


	
		
		
		
		
	}

}

