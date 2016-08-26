package string2;

public class StarOut {
	public static void main(String[] args) {
		String str = "sm***eil*ly";
		System.out.println(starOut(str));
	}

	public static String starOut(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != '*') {
				newStr += str.charAt(i);
			}
			// smily
			// returns a character that is not preceeded with *
			// e.g. ei - the index is 'i' and is not preceeded with *
			// therefore return 'i'
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
				newStr += str.charAt(i);
			}
			// if the index is * but the previous character of the index
			// is not a star then remove that character
			// e.g. m* - m is followed by a star so it will be removed
			// e.g. l*
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
				newStr = newStr.substring(0, newStr.length() - 1);
			}
		}
		return newStr;
	}

}
