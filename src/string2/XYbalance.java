package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class XYbalance {

    public static void main(String[] args) {
        String str = "yaaxbb";
        System.out.println(xybalance(str));
    }

    public static boolean xybalance(String str) {
        int countx = 0;
        int county = 0;
		// x must appear first
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals("x")) {
                countx++;
            }
            if (String.valueOf(str.charAt(i)).equals("y")) {
                county++;
            }
        }
        return countx <= county;
    }
}
