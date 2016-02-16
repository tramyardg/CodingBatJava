package warmup1;

/**
 * Created by RAYMART on 2016-02-15.
 */
public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(17, 16));
    }

    public static int max1020(int a, int b) {
        if ((inRange(a) && inRange(b))) {
            if (a > b)
                return a;
            else
                return b;
        }
        if (inRange(a) && !inRange(b)) {
            return a;
        }
        if (inRange(b) && !inRange(a)) {
            return b;
        }
        return 0;
    }

    public static boolean inRange(int n) {
        return (n >= 10 && n <= 20);
    }


}
