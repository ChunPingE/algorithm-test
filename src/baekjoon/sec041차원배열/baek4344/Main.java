package baekjoon.sec041차원배열.baek4344;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
	
		for (int i = 0 ; i < C ; i++) {
			int S = 0;
			double count = 0;
			double sum = 0;
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			//점수입력
			for (int j = 0 ; j < N ; j++ ) {
				S = sc.nextInt();
				arr[j] = S;
				sum += S;
			}
			
			
			for (int j = 0 ; j < N ; j++ ) {
				if (arr[j] > (double)sum / N) { 
				count++; 
			} 
			}
			System.out.printf("%.3f%%\n" , (double) count / N *100);
		}
	
		sc.close();
		
		
		
	}

}

