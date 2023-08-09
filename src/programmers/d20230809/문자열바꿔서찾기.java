package programmers.d20230809;

public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                arr[i] = 'B';
            } else {
                arr[i] = 'A';
            }
        }
        String newMyString = new String(arr);

        if (newMyString.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
