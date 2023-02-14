package sec09.baek2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//정수입력
        int N = sc.nextInt();
        int M = sc.nextInt();

		int[][] arra = new int[N][M];
		int[][] arrb = new int[N][M];
	
		//a 2차배열값입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arra[i][j] = sc.nextInt();
			}
		}
		//b 2차배열 값 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arrb[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arra[i][j] + arrb[i][j] + " ");
				if (j == M - 1)
					System.out.println();
			}
		}

	}

}
