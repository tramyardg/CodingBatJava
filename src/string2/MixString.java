package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MixString {

    public static void main(String[] args) {
        String a = "Long";
        String b = "So";

        System.out.println(mixString(a, b));
    }

    public static String mixString(String a, String b) {

        int diffLength = Math.abs(a.length() - b.length());
        String leftOver = "";

        if (a.length() == b.length()) {
            leftOver = "";
        } else if (a.length() > b.length()) {
            leftOver = a.substring(b.length());
        } else {
            diffLength = 0;
            leftOver = b.substring(a.length());
        }

        String newStr = "";
        for (int i = 0; i < a.length() - diffLength; i++) {
            newStr += String.valueOf(a.charAt(i))
                    + String.valueOf(b.charAt(i));
        }

        return newStr + leftOver;
    }

}
