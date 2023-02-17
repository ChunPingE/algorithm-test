package CodingBat.wramup_1;

public class makes10 {
	//합이 10이거나 둘중 하나가 10이면 true

	public boolean makes10(int a, int b) {
	  if (a + b == 10){
	    return true;
	  } else if (a ==10 || b==10){
	     return true;
	  } else{
	    return false;
	  }
	}

}
