package array1;

/**
 * Created by RAYMART on 2016-02-21.
 */
public class CommonEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3}; int[] arr2 = {1,3};
        System.out.println(commonEnd(arr,arr2));
        System.out.println(arr.length);
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if((a[0]==b[0])||(a[a.length-1]==b[b.length-1])) {
            return true;
        }
        return false;
    }
}
