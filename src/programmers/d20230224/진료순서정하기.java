package programmers.d20230224;

import java.util.Arrays;

public class 진료순서정하기 {
	public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] arr = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(emergency);
        
        for (int i = 0; i < answer.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
        		if(arr[i] == emergency[j]) {
        			answer[i] = emergency.length - j;
        		}
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr =solution(new int[] {3,76,24} );
        System.out.println(Arrays.toString(arr));
        //3 1 2
	}
}
