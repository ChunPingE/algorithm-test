package programmers.d20230804;

public class 더크게합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        String a_ = String.valueOf(a);
        String b_ = String.valueOf(b);

        int sum1 = Integer.parseInt(a_ + b_);
        int sum2 = Integer.parseInt(b_ + a_);

        answer =  Math.max(sum1, sum2);
        return answer;
    }
}
