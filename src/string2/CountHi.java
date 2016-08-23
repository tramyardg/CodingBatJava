package string2;

public class CountHi {
	public static void main(String[] args) {
		String str = "hk";
		System.out.println(countHi(str));
	}

	public static int countHi(String str) {
		int count = 0;
		if (str.length() < 2 && !str.equals("hi")) {
			return count;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("h") && str.substring(i + 1, i + 2).equals("i")) {
				count++;
			}
		}
		return count;
	}

}
