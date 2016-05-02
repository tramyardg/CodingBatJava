package ap1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ScoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        boolean cond = true;
        int expected = scores.length - 1;
        int count = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1]) {
                count++;
            }
        }
        if (count != expected) {
            cond = false;
        }
        return cond;
    }

}
