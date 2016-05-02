package ap1;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ScoresAverage {
    int halflen = 0;
    public int scoresAverage(int[] scores) {
        halflen =  scores.length / 2;
        int start = 0;
        
        int firstAvg = average(scores, start, halflen);
        int secondAvg = average(scores, halflen, scores.length);
        int[] avgArr = {firstAvg, secondAvg};
        Arrays.sort(avgArr);
        return avgArr[1];
    }

    private int average(int[] scores, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum/halflen;
    }

}
