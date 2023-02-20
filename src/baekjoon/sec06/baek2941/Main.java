package baekjoon.sec06.baek2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//c= c- dz= d- lj nj s= z=
		Scanner sc = new Scanner(System.in);
		
		
		//크로아티아어 배열 생성
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		String str = sc.next();

		//배열 돌면서 str에 포함되잇을경우 0으로 변경해주기
		for (int i = 0 ; i < arr.length ; i++) {
			if(str.contains(arr[i])) {
				str = str.replace(arr[i], "0");
			}
		}
		System.out.println(str.length());
		
	}

}
