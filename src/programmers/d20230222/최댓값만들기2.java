package programmers.d20230222;

public class 최댓값만들기2 {
	  public static int solution(int[] numbers) {
	        int answer = numbers[0] * numbers[1];
	        int result = 0;
	        for (int i = 0 ; i < numbers.length ; i++){
	            for(int j = 0 ; j < numbers.length; j++){
	                if ( numbers[i] == numbers[j] ){
	                    continue;
	                } else{
	                    result = numbers[i] * numbers[j];  
	                }
	                 if ( result >= answer) {
	                    answer = result;
	                    }

	            }
	        }
	        return answer;
	    }
	  
	public static void main(String[] args) {

		System.out.println(solution(new int[] {1,1,3}));
	}
}
