package baekjoon.sec03.baek2442;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		
		
		while (true) {
			System.out.println("몇 층짜리 피라미드 쌓겠습니까? 그만쌓으려면 q");
			System.out.print("입력>");
			String T = sc.nextLine();
			int num = Integer.parseInt(T);
			if (!T.toLowerCase().equals("q")) {
				if (num > 0) {
					for (int i = 0 ; i< num ; i++) {
						for(int j = i ; j < num - 1   ; j ++) {
							System.out.print(" ");
						}
						for(int k = 0 ; k < i*2 + 1  ; k++) {
							System.out.print("*");
						}
						
					System.out.println();
					}	
				} else {
					System.out.print("양의 정수를 입력해주세요");
				}
			} else {
				System.out.print("프로그램 종료");
				break;
			}
			
		}
				
				
				
				
		}
		

}

