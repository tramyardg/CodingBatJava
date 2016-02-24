package warmup2;

/**
 * Created by RAYMART on 2016-02-18.
 */
public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("chocolate"));
    }

    public static String altPairs(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            int a = i; int b = i + 2;
            // If b is less than the length of string
            // then return the string with the previous gathered
            // string where b is still less than string length
            if (b < str.length()) {
                res = res + str.substring(a, b);
            } else {
                // When you reach the sequence where b is greater than
                // the length of the string, simply print the string
                // starting at a
                res = res + str.substring(a);
            }
        }
        return res;
    }
}
