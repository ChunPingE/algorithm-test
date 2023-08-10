package programmers.d20230810;

public class 글자이어붙이기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] strArr = my_string.split("");
        for (int i = 0; i < index_list.length; i++) {
            answer += strArr[index_list[i]];
        }
        return answer;
    }
    
    //시간오래걸려서 남의답 덧셈연산말고 stringbuidler

/*    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }*/
}
