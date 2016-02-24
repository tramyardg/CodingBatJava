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
        // Iterate through the list starting at index 0
        // if one of the index contains 9 then increment
        // the counter by 1 with count++, return count at
        // the end of the loop to keep adding
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
