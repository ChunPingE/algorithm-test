package baekjoon.d20230309.baek2108;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//통계학
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		int sum = 0;
		int many = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		// 평균
		int avg = (int)Math.round(((double)sum /n));

		// 중앙값
		Arrays.sort(arr);
		int mid = arr[n / 2];

		// 최빈값
		int[] plus = new int[4002];
		int[] minus = new int[4001];
		for (int i = 0; i < n; i++) {
			// 0 ~ 4000 빈도 저장
			if (arr[i] < 0) {
				minus[Math.abs(arr[i])]++;
			}
			// -1 ~ -4000 빈도 저장
			else {
				plus[arr[i]]++;
			}
		}
		
		// 가장 높은 빈도수 체크
		int max = 0;
		for (int i = 0; i < plus.length; i++) {
			max = Math.max(max, plus[i]);

		}
		for (int i = 0; i < minus.length; i++) {
			max = Math.max(max, minus[i]);
		}

		ArrayList<Integer> list = new ArrayList<>();
		
		// 가장 빈도 높은 숫자들 따로 ArrayList에 담기
		for (int i : arr) {
			if (i < 0) {
				if (minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			} else {
				if (plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}

		// 2개 이상이면 2번째로 작은 것 출력
		if (list.size() >= 2) {
			many = list.get(1);
		}
		// 1개면 그대로
		else {
			many = list.get(0);
		}
		
		//범위
		int range = arr[n-1] - arr[0];
		
		System.out.println(avg);
		System.out.println(mid);
		System.out.println(many);
		System.out.println(range);
	}
}
