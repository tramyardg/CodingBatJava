package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class BlackJack {

    
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if ((21 - a) <= (21 - b)) {
            return a;
        }
        if ((21 - a) >= (21 - b)) {
            return b;
        }
        return 0;
    }
}
