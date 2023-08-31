package programmers.d20230831;

public class 간단한논리연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean y1 = false;
        boolean y2 = false;

        if (x1 || x2) {
            y1 = true;
        }

        if (x3 || x4) {
            y2 = true;
        }

        if (y1 && y2) {
            answer = true;
        }

        return answer;
    }
}
