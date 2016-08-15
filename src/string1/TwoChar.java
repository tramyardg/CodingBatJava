package string1;

public class TwoChar {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(twoChar(str, 99));
	}

	public static String twoChar(String str, int n) {
		int strLen = str.length();
		if (n == strLen || n < 0 || n > strLen) {
			return str.substring(0, 2);
		}
		if ((strLen - n) % 2 != 0) {
			return str.substring(0, 2);
		}
		return str.substring(n, n + 2);
	}
}
