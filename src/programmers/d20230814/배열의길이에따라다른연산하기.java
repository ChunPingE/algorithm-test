package programmers.d20230814;

public class 배열의길이에따라다른연산하기 {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i];

                } else {
                    answer[i] = arr[i] + n;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i];
                } else {
                    answer[i] = arr[i] + n;

                }
            }
        }
        return answer;
    }
}
