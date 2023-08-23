package programmers.d20230823;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기5 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s + l);
            System.out.println(s);
            System.out.println(l);
            System.out.println(str);
            Integer intStr = Integer.parseInt(str);
            System.out.println(intStr);
            if (intStr > k) {
                list.add(intStr);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
    }
}
