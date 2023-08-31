package programmers.d20230831;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx) + pat;
        return answer;
    }
}
