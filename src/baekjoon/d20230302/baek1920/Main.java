package baekjoon.d20230302.baek1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 수 찾기
	// 메모리 초과
	//https://yeoncoding.tistory.com/424 
	//https://st-lab.tistory.com/261
	//이분탐색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
	   Arrays.sort(arr);
	   
	   int m = sc.nextInt();
	   
		
		

	}
}
