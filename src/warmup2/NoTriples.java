package warmup2;

/**
 * Created by RAYMART on 2016-02-18.
 */
public class NoTriples {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        //          (0, 1, 2, 3, 4)
        System.out.println(noTriples(arr));
    }

    public static boolean noTriples(int[] a) {
        if (a.length >= 3) {
            for (int i = 0; i <= a.length - 2; i++) {
                if (a[i] == a[i + 1]) {//a[0]->1
                    if (a[i + 1] == a[i + 1 + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
