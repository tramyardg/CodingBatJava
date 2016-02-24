package warmup2;

/**
 * Created by RAYMART on 2016-02-17.
 */
public class Array123 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        System.out.println(array123(arr));
    }

    public static boolean array123(int[] a) {
        /**
         *  Very important:
         *       Note: iterate < length-2, so can use i+1 and i+2 in the loop
         */
        if (a.length >= 3) {
            // -2 prevents index out of bounds
            for (int i = 0; i <= a.length - 2; i++) {
                if (a[i] == 1) {
                    if (a[i + 1] == 2) {
                        if (a[i + 2] == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
