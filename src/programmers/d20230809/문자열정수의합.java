package programmers.d20230809;

public class 문자열정수의합 {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }

 /*   public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++){
            answer += (int)num_str.charAt(i) - 48;
        }

        return answer;
    }*/
}
