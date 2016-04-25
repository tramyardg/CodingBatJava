package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean cond = false;
        // no matter what the bOk values as long as the
        // order is followed a<b<c return true
        if (b > a && b < c && (bOk == true || bOk == false)) {
            cond = true;
        }
        // if a is greater or equal to b, and b is less
        // than c, then bOk must be true to return true
        if (a >= b && b < c && (bOk == true)) {
            cond = true;
        }
        return cond;
    }

}
