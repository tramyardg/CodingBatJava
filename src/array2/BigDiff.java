package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class BigDiff {
    public int bigDiff(int[] nums) {
        Arrays.sort(nums); // sort the array ascending order
        int diff = nums[nums.length-1] - nums[0];
        return diff;
    }
} 
