package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class XYbalance {

	public static void main(String[] args) {
		String str = "y";
		System.out.println(xyBalance(str));
	}

	public static boolean xyBalance(String str) {
		int countX = 0;
		int countY = 0;
		int indexX = 0;
		int indexY = 0;
		if (!str.contains("x")) {
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equals("x")) {
				indexX = i;
				countX++;
			}
			if (String.valueOf(str.charAt(i)).equals("y")) {
				indexY = i;
				countY++;
			}
		}
		if (indexY > indexX && countY >= countX) {
			return true;
		}
		if (indexX < indexY && countX >= countY) {
			return true;
		}
		return false;
	}
}
