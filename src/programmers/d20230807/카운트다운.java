package programmers.d20230807;

public class 카운트다운 {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for (int i = 0; i <= start - end; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}
