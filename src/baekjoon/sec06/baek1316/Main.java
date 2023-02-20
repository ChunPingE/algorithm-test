package baekjoon.sec06.baek1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;

		for (int i = 0; i < N; i++) {
			boolean[] arr = new boolean[26];
			boolean tmp = true;
			String str = sc.next();

			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 'a'; // -97
				//기본false니까 처음봣으면 else로
				//true라면 연속문자가 아니니 tmp를 flase로 만들고 반복문 나가기 빠져나가기
				if (arr[index]) { 
					if (str.charAt(j) != str.charAt(j - 1)) {
						tmp = false;
						break;
					}
				} else {
					arr[index] = true;
				}
				
			}
			if(tmp) {
				count++;
			}
		}
		System.out.println(count);

	}

}

