package programmers.d20230807;

import java.util.ArrayList;
import java.util.List;

public class n번째원소까지 {
    public int[] solution(int[] num_list, int n) {

        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= num_list.length; i++) {
            if (i > n) {
                break;
            }
            answerList.add(num_list[i-1]);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
