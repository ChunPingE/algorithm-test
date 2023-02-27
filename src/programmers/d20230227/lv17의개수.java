package programmers.d20230227;

public class lv17의개수 {
	public static int solution(int[] array) {
        int answer = 0;
        String str = "";
        
        for (int i = 0; i < array.length; i++) {
			str += String.valueOf(array[i]);
		}
        
        String[] arr = str.split("");
        
        for (String s : arr) {
			if (s.equals("7")) {
				answer++;
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		solution(new int[] {7,17,77});
	}
}
