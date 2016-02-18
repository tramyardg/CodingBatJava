package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("hi", 3));
    }

    public static String stringTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            //res = res + str;
            // this is add and assignment operator.
            // +=
            res += str; //res = res + str;
        }


        //System.out.println(str);
        return res;
    }
}
