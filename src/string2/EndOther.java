package string2;

public class EndOther {
	public static void main(String[] args) {
		String stra = "abc";
		String strb = "abXabc";
		System.out.println(endOther(stra, strb));
	}

	public static boolean endOther(String a, String b) {
		String lca = a.toLowerCase();
		String lcb = b.toLowerCase();
		int lenA = a.length();
		int lenB = b.length();
		if (lenA > lenB) {
			if (lca.substring((lenA - lenB), lenA).equals(lcb)) {
				return true;
			}
		}
		if (lenA < lenB) {
			if (lcb.substring((lenB - lenA), lenB).equals(lca)) {
				return true;
			}
		}
		if (lenA == lenB && lca.equals(lcb)) {
			return true;
		}
		return false;

	}

}
