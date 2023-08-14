package programmers.d20230814;

public class 특정한문자를대문자로바구기 {
    public String solution(String my_string, String alp) {
        String answer = "";
        if (my_string.contains(alp)) {
            answer = my_string.replace(alp, alp.toUpperCase());
        } else {
            answer = my_string;
        }
        return answer;
    }
}
