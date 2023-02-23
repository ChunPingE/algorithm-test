package programmers.d20230223;

import java.util.Arrays;
import java.util.Collections;

public class lv1자연수뒤집어배열로만들기 {

	public int[] solution1(long n) {
		String str = String.valueOf(n);
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		int[] answer = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			answer[i] = chars[chars.length - i -1] - '0';
		}

		return answer;
	}
	
	public int[] solution2(long n) {
		String str = String.valueOf(n);
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		int[] answer = new int[chars.length];
        int i = 0;
        while (n > 0){
            answer[i] = (int) (n % 10);
            n = n / 10;
            i++;
        }
        /*
		for (int i = 0; i < chars.length; i++) {
			answer[i] = chars[chars.length - i -1] - '0';
		}
        */
		return answer;
	}

}
