package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MakeChocolate {

    private final int BIG_SIZE = 5;

    public int makeChocolate(int small, int big, int goal) {
        // goal / BIG_SIZE : to see how many big is needed
        // if there is a remainder of goal / BIG_SIZE 
        // then take the small instead
        // multiply this small to the BIG_SIZE
        // the result is substracted to the goal
        int s = goal - Math.min(big, goal / BIG_SIZE) * BIG_SIZE;
        // if the small and the big needed is less than the goal
        // and if the remainder of goal and BIG_SIZE is greater than
        // small then it can't be done
        if (goal % BIG_SIZE > small || big * BIG_SIZE + small < goal) {
            s = -1;
        }

        return s;
    }

}
