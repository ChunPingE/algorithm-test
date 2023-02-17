package CodingBat.wramup_1;

public class sleepIn {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false && vacation == false) {
			return true;
		} else if (weekday == true && vacation == false) {
			return false;
		} else if (weekday == false && vacation == true) {
			return true;
		} else {
			return true;
		}
	}
}
