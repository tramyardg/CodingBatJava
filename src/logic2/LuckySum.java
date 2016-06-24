package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class LuckySum {

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13 && b != 13 && c != 13) {
            sum = a + b + c;
        }
        if (a != 13 && b == 13 && c == 13) {
            sum = a;
        }
        if (a == 13) {
            sum = 0;
        }
        if (b == 13 && a != 13) {
            sum = a;
        }
        if (c == 13 && a != 13 && b != 13) {
            sum = a + b;
        }
        return sum;
    }

}
