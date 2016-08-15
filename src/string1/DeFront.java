package string1;

public class DeFront {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(deFront(str));
	}
	
	public static String deFront(String str) {
		int strLen = str.length();
		String newStr = "";
		if (strLen < 2) {
			newStr = str;
		}
		String firstCh = String.valueOf(str.charAt(0));
		String secondCh = String.valueOf(str.charAt(1));
		if (!firstCh.equals("a") && !secondCh.equals("b")) {
			newStr = str.substring(2);
		}
		if (firstCh.equals("a") && secondCh.equals("b")) {
			newStr = str;
		} else {
			if (firstCh.equals("a")) {
				newStr = firstCh + str.substring(2);
			}
			if (secondCh.equals("b")) {
				newStr = secondCh + str.substring(2);
			}
		}
		return newStr;
	}

}
