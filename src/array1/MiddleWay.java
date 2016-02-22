package array1;
import java.util.Arrays;
/**
 * Created by RAYMART on 2016-02-21.
 */
public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1,2,3}; int[] b = {4,5,6};
        System.out.println(Arrays.toString(middleWay(a,b)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] res = {a[1],b[1]};
        return res;
    }
}
