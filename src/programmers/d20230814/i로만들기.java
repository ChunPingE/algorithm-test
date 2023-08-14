package programmers.d20230814;

public class i로만들기 {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 'l') {
                arr[i] = 'l';
            }
        }
        String answer = new String(arr);

        return answer;
    }
    //  myString.replaceAll("[^l-z]", "l");
}
