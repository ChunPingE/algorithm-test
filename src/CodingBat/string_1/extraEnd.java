package CodingBat.string_1;

public class extraEnd {
	//마지막 두글자 3번 반복하기
	public static String extraEnd(String str) {
		  String end = str.substring(str.length()-2);
		  return end + end + end;
		}
	
	public static void main(String[] args) {
		System.out.println(extraEnd("hello"));
		
	}
}
