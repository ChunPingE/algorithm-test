package programmers.d20230831;

public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        int end = pat.length();
        for (int i = 0; i < myString.length(); i++) {
            String str = myString.substring(i, end);
            if (str.contains(pat)) {
                answer++;
            }
            end++;
            if (end > myString.length()){
                break;
            }
        }
        return answer;
    }
}
