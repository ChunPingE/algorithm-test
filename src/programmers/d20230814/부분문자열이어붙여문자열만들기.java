package programmers.d20230814;

public class 부분문자열이어붙여문자열만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = 0;

        for (int i = 0; i < parts.length; i++) {
            start = parts[i][0];
            end = parts[i][1] + 1;

            sb.append(my_strings[i].substring(start, end));
        }

        String answer = sb.toString();

        return answer;
    }
}
