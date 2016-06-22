package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class EvenlySpaced {

    /**
     * evenlySpaced(10, 9, 11) → true	
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean evenlySpaced(int a, int b, int c) {
        boolean cond = false;

        if (a == b && b == c && c == a) {
            cond = true;
        }
        if (c > b && b > a && c > a) {
            if (c - b == b - a) {
                cond = true;
            }
        }
        if (b < a && b < c) {
            if (a > c) {
                if (a - b == c && b + c == a) {
                    cond = true;
                }
            } else if (c - a == a - b) {
                cond = true;
            }
        }
        if (b > a && b > c) {
            if (b - a == c && b - c == a) {
                cond = true;
            }
        }

        return cond;
    }

}
