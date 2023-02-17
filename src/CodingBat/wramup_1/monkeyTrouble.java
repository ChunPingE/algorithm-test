package CodingBat.wramup_1;

public class monkeyTrouble {
	// 둘다 웃거나 둘다 안웃으면 문제상황이다.

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
			return true;
		} else if (!aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}
	}

}
