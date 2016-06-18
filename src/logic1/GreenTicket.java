package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        int ticket = 0;
        if ((a == b && a != c && b != c)
                || (b == c && b != a && c != a)
                || (a == c && a != b && c != b)) {
            ticket = 10;
        } else if (a == b && b == c && c == a) {
            ticket = 20;
        }
        return ticket;
    }

}
