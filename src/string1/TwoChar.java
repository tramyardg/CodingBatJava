package string1;

public class TwoChar {

//Given a string and an index, return a string length 2 starting at the given index. 
//If the index is too big or too small to define a string length 2, use the first 2 chars. 
//The string length will be at least 2.
//
//twoChar("java", 0) → "ja"
//twoChar("java", 2) → "va"
//twoChar("java", 3) → "ja"
//	twoChar("java", 4) → "ja"
//	twoChar("java", -1) → "ja"
//	twoChar("Hello", 99) → "He"
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
