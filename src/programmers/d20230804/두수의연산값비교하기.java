package programmers.d20230804;

public class 두수의연산값비교하기 {
    public int solution(int a, int b) {
        int answer = 0;
        String a_ = String.valueOf(a);
        String b_ = String.valueOf(b);

        int sum = Integer.parseInt(a_ + b_);

        int result = 2 * a * b;

        if (sum == result){
            answer = sum;
        } else {
            answer = Math.max(sum, result);
        }

        return answer;
    }
}
