package string2;

public class PrefixAgain {
	public static void main(String[] args) {
		String str = "abXYabc";
		System.out.println(prefixAgain(str, 3));
	}

	public static boolean prefixAgain(String str, int n) {
		if (str.length() < n) {
			return false;
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(n - 1, n - 1 + 1).equals(String.valueOf(str.charAt(i)))) {
				count++;
			}
		}
		if (count > 1) {
			return true;
		}
		return false;
	}
}
