package string1;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class NonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
