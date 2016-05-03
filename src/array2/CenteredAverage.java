
package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int newArrLen = nums.length - 2;
        for(int i = 1; i < nums.length-1; i++) {
            sum += nums[i];
        }
        int avg = (int) Math.floor(sum/newArrLen);

        return avg;
    }

}
