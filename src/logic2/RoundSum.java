package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class RoundSum {

    public static void main(String[] args) {
        System.out.println(roundSum(6,4,4));
    }
    
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int r = 0;
        if (num % 10 >= 5) {
            r = num + (10 - num % 10);
        } else {
            r = num - (num % 10);
        }
        return r;
    }

}
