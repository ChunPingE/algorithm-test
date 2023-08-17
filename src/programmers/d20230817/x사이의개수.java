package programmers.d20230817;

public class x사이의개수 {
    public int[] solution(String myString) {

        String[] arr = myString.split("x");

        if (myString.endsWith("x")) {
            int[] answer = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i].length();
            }
            return answer;
        } else {
            int[] answer = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i].length();
            }
            return answer;
        }
    }
}
