package string1;

public class Right2 {


//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
//
//right2("Hello") → "loHel"
//right2("java") → "vaja"
//right2("Hi") → "Hi"
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(right2(str));
	}
	
	public static String right2(String str) {
		int strLen = str.length();
		if(strLen<=2) {
			return str;
		}
		String last2Ch = str.substring(str.length()-2,str.length());
		String first = str.substring(0,str.length()-2);
		
		return last2Ch+first;
	}
}
