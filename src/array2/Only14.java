package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Only14 {

    public boolean only14(int[] nums) {
        boolean cond = false;
        int count = 0;
        // if the array is empty
        // return true
        if (nums.length <= 0) {
            cond = true;
        }

        for (int i = 0; i < nums.length; i++) {
            // if nums contents are either 1s or 4s
            // then return true
            // otherwise count the number of times
            // nums is not 4 or 1
            // if more than or equal to 1 it means we
            // a none-1 and none-4 number in the array
            if (nums[i] == 4 || nums[i] == 1) {
                cond = true;
            } else {
                count++;
            }
        }
        if (count >= 1) {
            cond = false;
        }

        return cond;
    }
}
