package warmup1;

/**
 * Created by RAYMART on 2016-02-15.
 */
public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("hi"));
    }

    public static String endUp(String str) {
        if (str.length() >= 3) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
        return str.toUpperCase();
    }
}
