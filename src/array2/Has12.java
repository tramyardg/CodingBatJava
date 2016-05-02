package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Has12 {

    public boolean has12(int[] nums) {
        boolean cond = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // when you are at index 1
                // use another for loop to
                // starting at that index and
                // find the number 2 from the
                // remaining elements of the
                // array, return if found
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
