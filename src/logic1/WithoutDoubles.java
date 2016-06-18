package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class WithoutDoubles {

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int ret = 0;
        int sumDie1n2 = die1 + die2;
        if (sumDie1n2 < 6 && noDoubles == true || noDoubles == false) {
            ret = sumDie1n2;
        } else {
            ret = sumDie1n2;
        }
        if (die1 == die2 && noDoubles == false) {
            ret = sumDie1n2;
        }
        if (die1 == die2 && noDoubles == true) {
            if (die1 == 6 && die2 == 6) {
                ret = die1 + 1;
            } else {
                ret = sumDie1n2 + 1;
            }
        }
        return ret;

    }

}
