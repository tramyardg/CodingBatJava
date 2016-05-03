package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Either24 {
/**
 * Given an array of ints, return true if the array 
 * contains a 2 next to a 2 or a 4 next to a 4, but not both.
 * @param nums
 * @return 
 */
    public boolean either24(int[] nums) {
        boolean cond = false;
        int count2 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // count the number of 2s and 4s next to each other
            // if for instance there are two 2s and two 4s
            // in the same array next to each other 
            // then the count is one
            // which means this is false
            // thus, the have same count value
            // return true if the array contains 
            // two 2s or two 4s next to each
            // other but NOT BOTH
            if (nums[i] == 4 && nums[i + 1] == 4) {
                count4++;
                cond = true;
            } else if (nums[i] == 2 && nums[i + 1] == 2) {
                count2++;
                cond = true;
            }
            if (count4 == count2) {
                cond = false;
            }
        }
        return cond;
    }

}
