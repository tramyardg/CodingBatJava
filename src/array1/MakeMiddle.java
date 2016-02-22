package array1;

import java.util.Arrays;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class MakeMiddle {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 9};
        //           0 1 2 3
        System.out.println(arr.length / 2);
        System.out.println(Arrays.toString(makeMiddle(arr)));
    }

    public static int[] makeMiddle(int[] a) {
        int d = (a.length / 2) - 1; // 2- 1
        int[] res = {a[d], a[d + 1]};
        return res;
    }
}
