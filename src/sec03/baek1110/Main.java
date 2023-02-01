package sec03.baek1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rst;
		int count = 0;
		
		int num = sc.nextInt();
		int firstnum = num;
		while(true) {
			int a = num / 10; //첫수 10의자리
			int b = num % 10; //첫수 1의자리
			int c = (a + b) % 10; //새로나온수 1의자리
			int d = b*10 + c; //첫수1의자리 *10 해서10의자리 + 새로나온수 1의자리 =새로운 수
			
			num = d;
			count++;
			if(firstnum == num) {
				break;
			}
			
			
		}
		System.out.println(count);

	}

}


