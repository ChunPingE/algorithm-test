package baekjoon.d20230309.baek2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//통계학
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int sum = 0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			if (arr[i] > max){
				max = arr[i];
			}
			if (arr[i] < min){
				min = arr[i];
			}
			 
		}
		
		Arrays.sort(arr);
		int mid = arr[arr.length / 2 + 1];
		int avg = sum / n;
		int range = max - min;
		
	}
}
