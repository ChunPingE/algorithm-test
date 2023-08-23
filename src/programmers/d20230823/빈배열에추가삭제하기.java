package programmers.d20230823;

import java.util.ArrayList;
import java.util.List;

public class 빈배열에추가삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            int s = 0;
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                s = list.size();
                for (int j = s; j > s - arr[i]; j--) {
                    list.remove(j - 1);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
