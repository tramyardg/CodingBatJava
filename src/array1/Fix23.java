package array1;

import java.util.Arrays;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class Fix23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(fix23(arr)));
    }

    public static int[] fix23(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 2) {
                if (a[i + 1] == 3) {
                    a[i + 1] = 0;
                }
            }
        }
        return a;
    }
}
