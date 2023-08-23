package programmers.d20230823;

import java.util.ArrayList;
import java.util.List;

public class 세로읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i += m) {
            String sub = my_string.substring(i, i + m);
            list.add(sub);
        }

        for (String str : list) {
            answer += str.substring(c-1, c);
        }

        return answer;
    }
}
