package programmers.d20230820;

public class 간단한식계산하기 {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        if (arr[1].equals("+")) {
            answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        } else if (arr[1].equals("-")) {
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        } else if (arr[1].equals("*")) {
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        return answer;
    }
}
