package baekjoon.sec041차원배열.baek10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int Y = sc.nextInt();
			arr[i] = Y;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < X) {
				System.out.printf("%s ", arr[i]);
			}
		}
		
		
		
	}

}

