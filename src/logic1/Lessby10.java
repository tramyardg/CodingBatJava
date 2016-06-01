package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Lessby10 {

    public boolean lessBy10(int a, int b, int c) {
        boolean cond = false;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);
        if (absA > 10 && absB <= 10 && absC <= 10) {
            cond = true;
        } else if (b > 10) {
            if (a > c || c == a) {
                int diff = b - 10;
                if(c<=diff) {
                  cond = true;
                }
            } else if (absB > 10 && absC <= 10 && absA <= 10) {
                cond = true;
            }
        } else if (absA <= 10 && absB <= 10 && absC > 10) {
            cond = true;
        } else if(a<-1||b<-1||c<-1) {
            cond = true;
        }
        return cond;
    }

}
