package programmers.d20230817;

public class 다섯명씩 {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length - 1) / 5 + 1];

        for (int i = 0, j = 0; i < names.length; i = i + 5, j++) {
            answer[j] = names[i];
        }

        return answer;
    }
}
