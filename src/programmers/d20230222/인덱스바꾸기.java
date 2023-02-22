package programmers.d20230222;

public class 인덱스바꾸기 {
	public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String a = my_string.substring(num1, num1+1);
        String b = my_string.substring(num2, num2+1);
        String[] arr = my_string.split("");
        arr[num1] = b;
        arr[num2] = a;
        for (int i = 0 ; i < arr.length ; i++){
            answer += arr[i];
        }
        return answer;
    }

	public static void main(String[] args) {
		solution("abcd", 1, 2);
	}

}
