package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class BlackJack {
    public int blackjack(int a, int b) {
        // clearer solution
        if (a > 21 && b <= 21) {
            return b;
        }
        if (a <= 21 && b > 21) {
            return a;
        }
        if (a > 21 && b > 21) {
            return 0;
        }
        // else they are both less than 21
        return Math.max(a, b);
    }
}
