package programmers.d20230802;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
            answer += arr[i];
        }
        System.out.println(answer);
/*
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();

        for (Character c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);*/
    }


}
