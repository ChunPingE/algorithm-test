package programmers.d20230810;

import java.util.Arrays;

public class 길이에따른연산 {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int intValue : num_list) {
                answer += intValue;
            }
        } else {
            int j = 1;
            for (int intValue : num_list) {
                j *= intValue;
            }
            answer = j;
        }
        return answer;
    }
}