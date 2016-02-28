package array1;

/**
 * Created by RAYMART on 2016-02-27.
 */
public class No23 {
    public static void main(String[] args) {
        int[] arr = {4, 2};
        System.out.println(no23(arr));
    }

    public static boolean no23(int[] n) {
        int a = n[0];
        int b = n[1];
        // both sides must not be equal to 2 or 3
        // so use && everywhere
        if ((a != 2 && a != 3) && (b != 2 && b != 3)) {
            return true;
        }
        return false;
        // could be written as one line
        // return (a!=2&&a!=3) && (b!=2&&b!=3);
    }
}
