package programmers.lv0_20230221;

import java.util.Scanner;

public class 직각삼각형출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            for (int j =0; j < n ; j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}