package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi(""));
    }

    public static boolean startHi(String str) {
        if(str.length() <= 1) {
            return false;
        }
        String hiStr = str.substring(0,2);
        if(hiStr.equals("hi")) {
            return true;
        }
        return false;
    }
}
