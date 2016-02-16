package warmup1;

/**
 * Created by RAYMART on 2016-02-15.
 */
public class IntMax {
    public static void main(String[] args) {
        System.out.println(intMax(41, 26, 19));
    }

    public static int intMax(int a, int b, int c) {
        if ((c > a && c > b)) {
            return c;
        } else if ((b > a && b > c)) {
            return b;
        }
        return a;
    }
}
