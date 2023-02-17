package CodingBat.wramup_1;

public class notString {
	public String notString(String str) {
		  if (str.length() >= 3 && str.startsWith("not")){
		    return str;
		  } else {
		    return "not " + str;
		  }
		}

}
