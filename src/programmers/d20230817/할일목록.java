package programmers.d20230817;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        int length = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                length++;
            }
        }

        String[] answer = new String[length];

        for (int i = 0, j = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[j] = todo_list[i];
                j++;
            }
        }

        return answer;
    }
}
