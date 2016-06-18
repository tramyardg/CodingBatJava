package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class SumLimit {

    public int sumLimit(int a, int b) {
        int ret;
        int sum = a + b;
        String lim = String.valueOf(sum);
        if(lim.length()>String.valueOf(a).length()) {
            ret = a;
        } else {
            ret = sum;
        }
        return ret;
    }

}
