package baekjoon.d20230302.baek9506;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == -1) {
				break;
			}

			int[] arr = new int[n];
			int sum = 0;
			int index = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) { 
					arr[index] = i;
					sum += i;
					index++;
				}
			}

			if (sum != n) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}
			
			String str = "";
			str = n + " = ";
			for (int i = 0; i < index; i++) {
				if (i == index - 1) {
					str += arr[i];
				}
				else {
					str += arr[i] + " + ";
				}
			}
			System.out.println(str);
		}
		
	}
}