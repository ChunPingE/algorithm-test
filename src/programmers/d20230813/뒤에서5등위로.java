package programmers.d20230813;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for (int i = 5, j = 0; i < num_list.length; i++, j++) {
            answer[j] = num_list[i];
        }
        System.arraycopy(num_list, 5, answer, 0, num_list.length);
        return answer;
    }

/*    public int[] solution(int[] numList) {
        return Arrays.stream(numList).sorted().skip(5).toArray();
        answer = Arrays.copyOfRange(num_list,5,num_list.length);
    }*/
}
