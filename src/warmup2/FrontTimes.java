package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("kol", 4));
    }

    public static String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            // If the string is more than 3 chars
            // then take only the first 3 chars and print n times
            if (str.length() >= 3) {
                res += str.substring(0, 3); //res = res + str;
            } else {
                // If the length of the string is exactly three
                // simply print that n times
                res += str;
            }
        }
        return res;
    }
}
