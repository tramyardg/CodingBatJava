package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class CloseFar {

    public boolean closeFar(int a, int b, int c) {
        boolean cond = false;
        int sumDiff = Math.abs(a - b) + Math.abs(b - c);
        if (sumDiff > 4) {
            cond = true;
        }
        return cond;
    }

}
