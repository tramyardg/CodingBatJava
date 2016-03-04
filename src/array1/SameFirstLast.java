package array1;

/**
 * Created by RAYMART on 2016-02-29.
 */
public class SameFirstLast {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(sameFirstLast(arr));

    }

    public static boolean sameFirstLast(int[] a) {
        return a.length > 0 && (a[a.length - 1] == a[0]);
    }
}
