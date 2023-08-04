package programmers.d20230804;

public class 수조작하기 {
    public int solution(int n, String control) {
        int answer = 0;
        String[] arr = control.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("w")) {
                n = n + 1;
            } else if (arr[i].equals("s")) {
                n = n - 1;
            } else if (arr[i].equals("d")) {
                n = n + 10;
            } else {
                n = n - 10;
            }
        }

        answer = n;

        return answer;
    }
}
