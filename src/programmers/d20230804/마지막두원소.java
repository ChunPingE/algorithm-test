package programmers.d20230804;

import java.util.ArrayList;
import java.util.List;

public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
            answer[num_list.length] = (num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }
}
