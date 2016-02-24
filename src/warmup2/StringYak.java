package warmup2;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}
