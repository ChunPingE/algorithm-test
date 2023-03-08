package baekjoon.sec03반복문.baek8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//N까지의합 등차수열 2S = (N+1) +(N+1)+ (N+1) +(N+1)... 
		//S= N(N+1)/2
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		//System.out.println(N * (N+1) /2);
		
		for (int i = 1 ; i <= N ; i++) {
			sum += i ;
			
		}
		System.out.println(sum);
	}

}
