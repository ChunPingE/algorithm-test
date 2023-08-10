package programmers.d20230810;

public class 카운트업 {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for (int j = 0, i = start; i <= end; j++, i++) {
            answer[j] = i;
        }
        return answer;
    }
}
