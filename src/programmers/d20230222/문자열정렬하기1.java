package programmers.d20230222;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = new int[intStr.length()];
        for (int i = 0; i < intStr.length(); i++){
            answer[i] = intStr.charAt(i) - '0';
        }
        Arrays.sort(answer);
        
        return answer;
    }
}