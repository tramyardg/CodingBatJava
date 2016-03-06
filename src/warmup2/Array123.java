package warmup2;

/**
 * Created by RAYMART on 2016-02-17.
 */
public class Array123 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        int[] data = {5, 2, 1, 2, 3, 5, 8, 10, 6, 7};
        int[] data2 = {5, 1, 2, 3};
        System.out.println(array123(data));
    }

    /**
     * public static boolean array123(int[] a) {
     * <p>
     * <p>
     * if (a.length >= 3) {
     * // -2 prevents index out of bounds
     * for (int i = 0; i <= a.length - 2; i++) {
     * if (a[i] == 1) {
     * if (a[i + 1] == 2) {
     * if (a[i + 2] == 3) {
     * return true;
     * }
     * }
     * }
     * }
     * }
     * return false;
     * }
     */
    public static boolean array123(int[] a) {
        boolean cond = false;
        int initialVal = 1;
        int endingVal = 3;

        for (int i = 0; i < a.length; i++) {
            if (a.length < endingVal) break;  // check array length size

            if ((i == a.length - 1) && a[i] < endingVal) {  // check the last array content
                cond = false;
                break;
            }
            if (a[i] == initialVal) {
                if (endingVal == a[i]) {
                    break;
                }
                cond = true;
                initialVal++;

            } else {
                cond = false;
                initialVal = a[i] + 1;
            }
        }
        return cond;
    }

}
