package baekjoon.d20230302.baek2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//수정렬하기2
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		for (Integer i : list) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
