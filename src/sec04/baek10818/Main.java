package sec04.baek10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int Y = sc.nextInt();
			arr[i] = Y;
		}
		int max = -1000000;
		int min = 1000000;
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("%s %s", min, max);
	
		// Arrays.sort(arr); 원소들을 오름차순 정렬해줌. 
		
		
		
	}

}

