package warmup2;

/**
 * Created by RAYMART on 2016-02-18.
 */
public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i % 2) == 0) {
                char ch = str.charAt(i);
                res = res + String.valueOf(ch);
            }
        }
        return res;
    }
}
