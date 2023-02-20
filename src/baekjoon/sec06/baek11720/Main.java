package baekjoon.sec06.baek11720;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 된다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		for(int i = 0 ; i < n ; i ++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}

}

