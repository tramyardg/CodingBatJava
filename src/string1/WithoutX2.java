package string1;

public class WithoutX2 {
	public static void main(String[] args) {
		String str = "xx";
		System.out.println(withoutX2(str));
	}
	
	public static String withoutX2(String str) {
		int strLen = str.length();
		String newStr = "";
		if (strLen >= 2) {
			// return the string if the first two chars are not "x"
			if (!str.substring(0, 1).equals("x") && !str.substring(1, 2).equals("x")) {
				newStr = str;
			}
			// return an empty string if the first char and the second char are "x"
			if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
				newStr = str.substring(2);
			}
			// return the string after the first char
			if (str.substring(0, 1).equals("x") && !str.substring(1, 2).equals("x")) {
				newStr = str.substring(1);
			}
			// return the first char and the string after the second char
			if (str.substring(1, 2).equals("x") && !str.substring(0, 1).equals("x")) {
				newStr = str.substring(0, 1) + str.substring(2);
			}
		} else {
			newStr = "";
		}
		return newStr;
	}

}
