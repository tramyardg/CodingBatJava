package fizzbuzz;

import java.util.Arrays;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class FizzArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(4)));
    }

    public static int[] fizzArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }
}
