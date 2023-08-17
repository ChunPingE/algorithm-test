package programmers.d20230817;

public class 순서바꾸기 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;

        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}
