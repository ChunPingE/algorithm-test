package programmers.d20230814;

public class A강조하기 {
    public String solution(String myString) {

        char[] arr = myString.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'A';
            } else if (arr[i] >= 'B' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }

        String answer = new String(arr);

        return answer;
    }

  /*  myString = myString.toLowerCase();
    myString = myString.replace('a', 'A');

        return myString;*/
}
