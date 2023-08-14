package programmers.d20230814;

import java.util.ArrayList;
import java.util.List;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            list.remove(Integer.valueOf(delete_list[i]));
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
