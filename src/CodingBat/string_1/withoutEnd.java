package CodingBat.string_1;

public class withoutEnd {
	//앞뒤글자 뺀 문자 출력 2글자 이하라면 공백이될것이다.
	public String withoutEnd(String str) {
	  if (str.length() >= 3) {
	      return str.substring(1,str.length()-1);
	  } else {
	    return "";
	  }
	}


}
