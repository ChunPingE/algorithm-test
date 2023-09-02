package programmers.d20230902;

public class 조건에맞게수열변환하기2 {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] oldArr = new int[arr.length];
        while (count != arr.length) {
            count = 0;
            oldArr = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if (arr[i] == oldArr[i]) count++;
            }
            answer++;
        }

        return answer - 1;
    }
}
