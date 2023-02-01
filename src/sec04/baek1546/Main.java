package sec04.baek1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
	
		int[] arr = new int[N];
		int max = 0;
		double sum = 0;
		
		for (int i = 0; i < N ; i++) {
			int X =  sc.nextInt();
			arr[i] = X;
			if(X >= max) {
				max = X;
			}
		}
		for (int i = 0 ; i <N ; i++) {
			sum += (double) arr[i] / max * 100;
		}
		System.out.println((double) sum / N);
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}

