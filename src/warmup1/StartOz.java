package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("oz"));
    }

    public static String startOz(String str) {
        //o must always be the first char
        //z must always be the second char
        //otherwise output is ""

        //if input is empty "" or not in from oz the output is ""

        String res = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            res = res + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            res = res + str.charAt(1);
        }
        return res;

    }


}
