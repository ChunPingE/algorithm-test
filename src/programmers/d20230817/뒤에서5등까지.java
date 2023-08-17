package programmers.d20230817;

import java.util.Arrays;

public class 뒤에서5등까지 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        System.arraycopy(num_list, 0, answer, 0, 5);

        return answer;
    }
}
