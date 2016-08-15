package string1;

public class LastTwo {
	public static void main(String[] args) {
		String str = "a";
		System.out.println(lastTwo(str));
	}
	
	public static String lastTwo(String str) {
		int strLen = str.length();
		if (strLen < 2) {
			return  str;
		}
		String lastCh = str.substring(str.length() - 1);
		char secondLastCh = str.charAt(str.length() - 2);
		String secondLastChStr = String.valueOf(secondLastCh);
		return str.substring(0, str.length() - 2) + lastCh + secondLastChStr;
	}
}
