package programmers.d20230813;

public class 배열의원소만큼추가하기 {
    public int[] solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int[] answer = new int[sum];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;
    }
}
