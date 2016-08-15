package string2;

public class RepeatEnd {
	public static void main(String[] args) {
		System.out.println(repeatEnd("1234", 2));
	}

	public static String repeatEnd(String str, int n) {
		String newStr = "";
		
		if (str.length() < n) {
			return newStr;
		}
		
		for (int i = 0; i < n; i++) {
			newStr += str.substring(str.length() - n);
		}

		return newStr;
	}

}
