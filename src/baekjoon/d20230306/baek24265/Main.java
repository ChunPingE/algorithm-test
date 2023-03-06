package baekjoon.d20230306.baek24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		
		// i n-1 6 / 7  i+1 n-1 i+2 n-2
		System.out.println(n*(n-1)/2);
		System.out.println(2);
	}
}
