package programmers.d20230831;

import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int target = 1;

        while (target < len) {
            target *= 2;
        }

        int[] answer = new int[target];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
