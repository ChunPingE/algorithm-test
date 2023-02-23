package baekjoon.exercise.baek10798;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(input);
		String[][] strArr = new String[5][];
		String str = "";

		for (int i = 0; i < 5; i++) {
			strArr[i]= sc.nextLine().split("");
		}

		//큰길이 구하기
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < strArr[i].length) {
				max = strArr[i].length;
			}
		}
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if( i <strArr[j].length) {
					str += strArr[j][i];
				}
			}
		}
		
		System.out.println(str);
	}
}
