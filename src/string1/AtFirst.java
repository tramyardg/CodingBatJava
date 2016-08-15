package string1;

public class AtFirst {

	public static void main(String[] args) {
		String str = "";
		System.out.println(atFirst(str));
	}

	public static String atFirst(String str) {
		int strLen = str.length();
		if ((2 - strLen) == 1) {
			return str + "@";
		}
		if ((2 - strLen) == 2) {
			return str + "@" + "@";
		}
		return str.substring(0, 2);
	}

}
