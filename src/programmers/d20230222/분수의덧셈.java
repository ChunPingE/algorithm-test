package programmers.d20230222;

public class 분수의덧셈 {
	 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        int num1 = numer1 * denom2 + numer2* denom1;
	        int dem1 = denom1 * denom2;
	        
	          for(int i = num1-1; i > 1; i--) {
	            // 기약분수로 만들기
	            if(num1 % i == 0 && dem1 % i == 0) { 
	                num1 /= i;
	                dem1 /= i;
	            }
	        }
	        
	        answer[0] = num1;
	        answer[1] = dem1;
	        
	        return answer;
	    }

}
