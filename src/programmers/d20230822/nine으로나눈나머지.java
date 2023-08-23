package programmers.d20230822;

import java.math.BigInteger;

public class nine으로나눈나머지 {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        int answer = sum % 9;
        return answer;
    }
}
