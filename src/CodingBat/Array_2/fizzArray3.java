package CodingBat.Array_2;

public class fizzArray3 {

	public int[] fizzArray3(int start, int end) {
		int len = end - start;
		int[] res = new int[len];
		for (int i = 0; i < res.length; i++) {
			res[i] = start + i;
		}

		return res;

	}
}
