package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Sum28 {

    public boolean sum28(int[] nums) {
        int count = 0;
        boolean cond = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count += nums[i];
            }
        }
        if (count == 8) {
            cond = true;
        }
        return cond;
    }
}
