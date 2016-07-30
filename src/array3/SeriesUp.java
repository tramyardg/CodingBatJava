package array3;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class SeriesUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
    }

    public static int[] seriesUp(int n) {
        int len = n * (n + 1) / 2;
        int[] newArr = new int[n];
        for (int i = 0; i < len; i++) {
            if (i < n) {
                newArr[i] = i + 1;
            }
        }
        return newArr;
    }

}
