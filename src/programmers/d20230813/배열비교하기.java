package programmers.d20230813;

import java.util.Arrays;

public class 배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();

            answer = arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
        }


        return answer;
    }
}
