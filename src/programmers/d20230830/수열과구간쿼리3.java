package programmers.d20230830;

public class 수열과구간쿼리3 {
    public int[] solution(int[] arr, int[][] queries) {
        int num = 0;
        for (int i = 0; i < queries.length; i++) {
            num = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = num;
        }
        return arr;
    }
}
