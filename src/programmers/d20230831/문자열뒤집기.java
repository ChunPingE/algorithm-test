package programmers.d20230831;

public class 문자열뒤집기 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] oldStr = my_string.toCharArray();
        char[] newStr = new char[e - s + 1];
        System.arraycopy(oldStr, s, newStr, 0, e - s + 1);

        for (int i = s, j = newStr.length; i <= e; i++, j--) {
            oldStr[i] = newStr[j - 1];
        }

        answer = new String(oldStr);
        return answer;
    }

/*    public String solution(String my_string, int s, int e) {
        String answer = "";

        String str = my_string.substring(s, e+1);
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);

        StringBuilder strn = new StringBuilder(my_string);

        for(int i=s;i<=e;i++){
            strn.setCharAt(i, sb.charAt(i-s));
        }

        return String.valueOf(strn);
    }*/
}
