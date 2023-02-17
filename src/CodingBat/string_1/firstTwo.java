package CodingBat.string_1;

public class firstTwo {
	//앞 두글자 출력하는데 들어오는 문자열이 빈문자열일수도 있음
	//substring은 파라미터가 인덱스를 벗어나면 오류를 발생시킨다.
	
	public String firstTwo(String str) {
		  String start = "";
		  if (str.length() >= 2){
		     start = str.substring(0,2);
		  } else {
		     start = str;
		  }
		  return start;
		}

}
