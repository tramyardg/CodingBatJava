package warmup1;

/**
 * Created by RAYMART on 2016-02-15.
 */
public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("abc"));
    }

    public static String front22(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
        return str + str + str;
    }

}
