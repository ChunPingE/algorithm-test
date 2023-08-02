package programmers.d20230802;

import java.util.ArrayList;
import java.util.List;

public class 등차수열특정값더하기 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        List<Integer> intList = new ArrayList<>();
        // 5개면 5번 돔
        for (int i = 1; i <= included.length; i++) {
            intList.add(a + (i - 1) * d);
        }

        // 5개면 5번 돔
        for (int i = 1; i <= included.length; i++) {
            if (included[i - 1]) {
                answer += intList.get(i);
            }

        }
        return answer;
    }

    public int solution2(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
