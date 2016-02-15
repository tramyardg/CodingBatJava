package warmup1;

/**
 * Created by RAYMART on 2016-02-14.
 */
public class Front3 {

    public static void main(String[] args) {
        System.out.println(front3("ch"));
    }

    public static String front3(String str) {
        if (str.length() >= 3)
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        return str + str + str;
    }
}
