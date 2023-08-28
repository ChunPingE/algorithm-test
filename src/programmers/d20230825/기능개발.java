package programmers.d20230825;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        // 1. 작업완료까지 걸리는 일 수를 큐에 입력
        for (int i = 0; i < progresses.length; i++) {
            double remainTime = (double)(100 - progresses[i]) / (double)speeds[i];
            int progressDate = (int)Math.ceil(remainTime);

            queue.offer(progressDate);
        }

        // 2. front의 값과 큐에 들어있는 값들을 비교하여 front보다 작거나 같으면 배포수++
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int front = queue.poll();
            int cnt = 1;
            while (!queue.isEmpty() && queue.peek() <= front) {
                cnt++;
                queue.poll();
            }

            list.add(cnt);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
