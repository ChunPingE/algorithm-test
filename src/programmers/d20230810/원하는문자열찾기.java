package programmers.d20230810;

public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.toUpperCase().contains(pat.toUpperCase())) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
