package array1;

/**
 * Created by RAYMART on 2016-02-21.
 */
public class FirstLast6 {
    public static void main(String[] args) {
        int[] arr = {13, 6, 1, 2, 2, 3};
        System.out.println(firstLast6(arr));
    }

    public static boolean firstLast6(int[] a) {
        if ((a[0] == 6) || (a[a.length - 1] == 6)) {
            return true;
        }
        return false;
    }
}
