package programmers.d20230822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 접미사배열 {
    public String[] solution(String my_string) {

        // 11 /10 11/ 9 11 /
        List<String> list = new ArrayList<>();

        int start = my_string.length() - 1;
        int end = my_string.length();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(start, end));
            start--;
        }

        String[] answer = list.toArray(new String[list.size()]);

        Arrays.sort(answer);

        return answer;
    }
}
