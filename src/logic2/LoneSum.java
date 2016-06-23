package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class LoneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(3,3,1));
    }
    public static int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        if (a == b && c != a && c != b) {
            return c;
        }
        if (b == c && a != b && a != c) {
            return a;
        }
        if (a == c && b != a && b != c) {
            return b;
        }
        return 0;
    }

}
