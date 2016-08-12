package string2;

public class DoubleChar {
	public static void main(String[] args) {
		String str = "Hi-There";
		System.out.println(doubleChar(str));
	}
	public static String doubleChar(String str) {
		int strLen = str.length();
		String newStr = "";
		for(int i = 0; i < strLen; i++) {
			newStr += str.substring(i,i+1)+str.substring(i,i+1);
		}
		return newStr;
	}
}
	