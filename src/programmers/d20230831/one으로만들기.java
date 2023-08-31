package programmers.d20230831;

public class one으로만들기 {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < num_list.length; i++) {
            num = num_list[i];
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else if (num % 2 != 0) {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}
