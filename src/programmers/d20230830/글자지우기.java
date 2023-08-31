package programmers.d20230830;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = "";
        }

        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i];
        }
        return answer;
    }
}
