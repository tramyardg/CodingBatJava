package warmup1;

/**
 * Created by RAYMART on 2016-02-14.
 */
public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("not bad"));
    }

    public static String notString(String str) {
        if (str.length() >= 3) {
            if (!str.substring(0, 3).equals("not")) {
                return "not " + str;
            } else {
                return str;
            }
        }
        return "not " + str;

    }
}
