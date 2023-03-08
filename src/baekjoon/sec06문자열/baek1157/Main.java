package baekjoon.sec06문자열.baek1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//알파벳 개수만큼 배열생성
		int[] arr = new int[26];
		char result = '?';
		int max = -1;
		String word = sc.nextLine();
		
		for (int i = 0 ; i < word.length(); i++) {
			if (65 <= word.charAt(i) && word.charAt(i) <= 90) { // 대문자 범위
				arr[word.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
			}
			else {	// 소문자 범위
				arr[word.charAt(i) - 97]++;
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char) (i + 65);
			} else if(arr[i] == max){
				result = '?';
			}
			
		}

		System.out.println(result); 
		
		
		

	}

}
