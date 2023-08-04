package programmers.d20230804;

public class 문자열겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        int nowStr = my_string.length();
        int newStr = overwrite_string.length();

        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring((s + newStr), nowStr);

        return answer = str1 + overwrite_string + str2;
    }
}
