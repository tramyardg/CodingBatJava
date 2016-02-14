package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(2,120));
    }

    public static boolean icyHot(int a, int b) {
        return (a < 0 || b < 0) && (a > 100 || b > 100);
        //return false;
    }
}
