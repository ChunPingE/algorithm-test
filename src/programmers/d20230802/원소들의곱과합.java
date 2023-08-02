package programmers.d20230802;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int gob = 1;
        for (int i = 0 ; i < num_list.length; i++){
            sum += num_list[i];
            gob *= num_list[i];
        }

        if ( gob < Math.pow(sum, 2)  ){
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
