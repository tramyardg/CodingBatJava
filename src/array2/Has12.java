package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Has12 {

    /**
     * Return true whenever you have 
     * a 1 followed by 2 in the
     * array. 1 must come first.
     * @param nums
     * @return 
     */
    public boolean has12(int[] nums) {
        boolean cond = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // when you are at index 1
                // use another for loop
                // starting at that index and
                // find the number 2 from the
                // remaining elements of the
                // array, return true if found
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        cond = true;
                    }
                }
            }
        }
        return cond;
    }

}
