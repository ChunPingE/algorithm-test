package programmers.d20230809;

public class 문자열뒤의n글자 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length() - n);

        return answer;
    }
}
