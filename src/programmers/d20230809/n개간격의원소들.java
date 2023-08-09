package programmers.d20230809;

import java.util.ArrayList;
import java.util.List;

public class n개간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < num_list.length; i = i + n) {
            intList.add(num_list[i]);
        }
        int[] answer = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }

        return answer;
    }
}
