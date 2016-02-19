package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("kolanf", 4));
    }

    public static String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                res += str.substring(0, 3); //res = res + str;
            } else {
                res += str;
            }
        }
        return res;
    }
}
