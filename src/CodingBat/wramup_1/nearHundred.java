package CodingBat.wramup_1;

public class nearHundred {
	// 숫자의 100혹은 200에서 차이가 10인지
	public boolean nearHundred(int n) {
		if (Math.abs(100 - n) <= 10) {
			return true;
		} else if (Math.abs(200 - n) <= 10) {
			return true;
		} else {
			return false;
		}
	}

}
