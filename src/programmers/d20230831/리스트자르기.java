package programmers.d20230831;

import java.util.ArrayList;
import java.util.List;

public class 리스트자르기 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        switch (n) {
            case 1 -> {
                for (int i = 0; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
            }
            case 2 -> {
                for (int i = slicer[0]; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
            }
            case 3 -> {
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
            }
            case 4 -> {
                for (int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]) {
                    list.add(num_list[i]);
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
