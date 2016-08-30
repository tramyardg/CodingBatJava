package string2;

public class StarOut {
	public static void main(String[] args) {
		String str = "sm***eil*ly";
		System.out.println(starOut(str));
	}

	public static String starOut(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			// skips a character that comes before and after a star
			if (str.charAt(i) == '*') {
				continue;
			}
			if ((i > 0 && str.charAt(i - 1) == '*')) {
				continue;
			}
			if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
				continue;
			}
			newStr += str.charAt(i);
		}
		return newStr;
	}

}
