package programmers.d20230831;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 문자열묶기 {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            if (!map.containsKey(len)) {
                map.put(len, 1);
            } else {
                int cnt = map.get(len);
                map.put(len, cnt + 1);
            }
        }

        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            if (map.get(key) > answer) {
                answer = map.get(key);
            }
        }

        return answer;
    }
}
