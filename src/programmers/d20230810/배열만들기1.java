package programmers.d20230810;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기1 {
    public int[] solution(int n, int k) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                integerList.add(i);
            }
        }
        int[] answer = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            answer[i] = integerList.get(i);
        }
        return answer;
    }
}
