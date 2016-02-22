package warmup2;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class ArrayCount9 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(arr));
    }

    public static int arrayCount9(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
