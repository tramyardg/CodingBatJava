package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(10,10,15));
    }

    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if(b >= 13 && b <= 19) {
            return true;
        } else if(c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }
}
