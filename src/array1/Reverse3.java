package array1;

import java.util.Arrays;
/**
 * Created by RAYMART on 2016-02-21.
 */
public class Reverse3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // import the array utility to be able to convert array to
        // a meaningful output
        System.out.println(Arrays.toString(reverse3(arr)));

    }

    public static int[] reverse3(int[] a) {
        int[] res = {a[2], a[1], a[0]};

        return res;
    }
}
