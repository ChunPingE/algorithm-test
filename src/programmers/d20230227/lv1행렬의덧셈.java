package programmers.d20230227;

public class lv1행렬의덧셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        //answer[0][0] = arr1[0][0] + arr2[0][0]
	        //answer[0][1] = arr1[0][1] + arr2[0][1]
	        //answer[1][0] = arr1[0][0] + arr2[0][0]
	        
	        for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					answer[i][j]  = arr1[i][j] + arr2[i][j];
				}
			}
	        
	        return answer;
	    }

}
