package programmers.d20230804;

public class 코드처리하기 {
    public String solution(String code) {
        String answer = "";
        String[] arr = code.split("");

        int mode = 0;

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
            if (mode == 0) {
                if (i % 2 == 0) {
                    if (arr[i].equals("1")) {
                        continue;
                    }
                    result += arr[i];
                }
            } else {
                if (i % 2 != 0) {
                    if (arr[i].equals("1")) {
                        continue;
                    }
                    result += arr[i];
                }
            }
        }
        if (result.equals("")) {
            answer = "EMPTY";
        } else {
            answer = result;
        }
        return answer;
    }
}
