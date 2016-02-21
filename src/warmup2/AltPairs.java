package warmup2;

/**
 * Created by RAYMART on 2016-02-18.
 */
public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("Kitten"));
    }

    public static String altPairs(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            int a = i;
            int b = i + 2;
            if (b < str.length()) {
                res = res + str.substring(a, b);
            } else {
                res = res + str.substring(a);
            }
        }
        return res;
    }
}
