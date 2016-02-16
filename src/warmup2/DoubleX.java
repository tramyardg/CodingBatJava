package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("aaaax"));


    }

    public static boolean doubleX(String str) {
        if (str.contains("x") && str.length() >= 2) {
            if (str.indexOf("x") != str.length() - 1) {
                char ch = str.charAt(str.indexOf("x"));
                char nextCh = str.charAt(str.indexOf("x") + 1);
                if (ch == nextCh) {
                    return true;
                }
            }
        }
        return false;
    }
}
