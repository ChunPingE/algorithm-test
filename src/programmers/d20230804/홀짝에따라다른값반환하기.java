package programmers.d20230804;

public class 홀짝에따라다른값반환하기 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0){
            //짝수
            for (int i = 1; i <= n ; i++) {
                if (n % 2 == 0 ){
                    answer += i;
                }
            }
        } else {
            //홀수
            for (int i = 1; i <= n ; i++) {
                if (n % 2 != 0 ){
                    answer += i;
                }
            }
        }
        return answer;
    }
}
