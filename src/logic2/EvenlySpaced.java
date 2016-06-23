package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class EvenlySpaced {

    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean evenlySpaced(int a, int b, int c) {
        // you need to find the max
        // minimum and the middle number 
        // then you can find the difference
        // between mid and min, and mid and max
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        int mid = Math.min(Math.max(a, b), c);
        int mid2 = Math.max(Math.min(a, b), c);

        return Math.abs(mid - max) == Math.abs(mid - min)
                || Math.abs(mid2 - max) == Math.abs(mid2 - min);

    }

}
