package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class WithoutX {

    public static void main(String[] args) {
        String str = "hi";
        System.out.println(withoutX(str));

    }

    public static String withoutX(String str) {
        if (str.length() > 1) {
            if (str.startsWith("x") && str.endsWith("x")) {
                return str.substring(1, str.length() - 1);
            }
            if (str.endsWith("x")) {
                return str.substring(0, str.length() - 1);
            }
            if (str.startsWith("x")) {
                return str.substring(1);
            }
        } else if (str.length() == 1 && str.equals("x")) {
            return "";
        }

        return str;
    }

}
