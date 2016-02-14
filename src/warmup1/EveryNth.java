package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
    }

    public static String everyNth(String str, int N) {
        String res = "";
        char ch = ' ';
        for(int i =0; i < str.length(); i = i + N) {
            // this will keep adding the string next to the found string
            res = res + str.charAt(i);

        }
        return res;


    }

}
