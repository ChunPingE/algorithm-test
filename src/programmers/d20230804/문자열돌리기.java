package programmers.d20230804;

import java.util.Scanner;

public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        for (String str: arr) {
            System.out.println(str);
        }
    }
}
