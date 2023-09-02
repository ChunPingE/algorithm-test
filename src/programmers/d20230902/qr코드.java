package programmers.d20230902;

public class qr코드 {
    public String solution(int q, int r, String code) {
        String answer = "";

        String[] arr = code.split("");

        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) {
                answer += arr[i];
            }
        }

        return answer;
    }
}
