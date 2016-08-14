package string2;

public class BobThree {
	public static void main(String[] args) {
		String str = "b";
		System.out.println(bobThere(str));
	}

	public static boolean bobThere(String str) {
		if (str.length() < 3) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("b") && i <= str.length() - 3) {
				if (str.substring(i + 2, i + 3).equals("b")) {
					return true;
				}
			}
		}
		return false;
	}

}
