package programmers.d20230810;

public class n보다커질때까지더하기 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int intValue: numbers) {
            if (answer > n){
                break;
            }
            answer += intValue;
        }
        return answer;
    }
}
