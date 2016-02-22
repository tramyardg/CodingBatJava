package string1;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("abcdefg"));
    }

    public static String firstHalf(String str) {
        int res = 0;
        if ((str.length() % 2) == 0) {
            res = str.length() / 2;
        }
        return str.substring(0, res);
    }
}
