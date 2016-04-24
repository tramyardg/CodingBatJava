package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Has77 {

    public boolean has77(int[] nums) {
        boolean cond = false;
        for (int i = 0; i < nums.length - 2; i++) {
            // due the fact that we minus 2 at the length
            // the loop doesn't iterate in the last two elements
            // thus we check directly if the last two elements are equal
            // if that is the case then return true directly
            if (nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7) {
                cond = true;
            }
            if (nums[i] == 7) {
                if (nums[i + 1] == 7 || nums[i + 2] == 7) {
                    cond = true;
                }
            }
        }
        return cond;
    }

}
