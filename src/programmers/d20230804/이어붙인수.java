package programmers.d20230804;

public class 이어붙인수 {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddResult = "";
        String evenResult = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenResult += String.valueOf(num_list[i]);
            } else {
                oddResult += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(oddResult) + Integer.parseInt(evenResult);

        return answer;
    }
}
