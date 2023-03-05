package baekjoon.d20230305.baek10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int result = fac(n);

		System.out.println(result);
	}

	public static int fac(int num) {
		if (num <= 1) {
			return 1;
		}
		//6*5*4*3*2*1
		int n = num * fac(num-1);
		return n;
	}
}
