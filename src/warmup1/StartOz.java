package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ll"));
    }

    public static String startOz(String str) {

        if (str.substring(0, 2).equals("oz")) {
            return "oz";
        }
        if ((str.substring(0, 1).equals("o"))) {
            if (!str.substring(1, 2).equals("o")) {
                return "o";
            }
        }
        if ((str.substring(1, 2).equals("z"))) {
            if (!str.substring(0, 1).equals("z")) {
                return "z";
            }
        }

        return "error";
    }


}
