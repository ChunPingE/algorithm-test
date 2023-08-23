package programmers.d20230823;

public class 수열과구간쿼리 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][2]; j++) {
                answer[j] = answer[j] + 1;
            }
        }
        return answer;
    }
}
