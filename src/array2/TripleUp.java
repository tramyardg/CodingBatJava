package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class TripleUp {

    public boolean tripleUp(int[] nums) {
        boolean cond = false;
        for (int i = 0; i < nums.length - 2; i++) {
            // check if the number next to each other
            // is increasing by 1
            // only applies to three numbers simultaneously
            // [n,4,5,6,n] or [n,n,1,2,3,n]
            int diff1 = nums[i + 1] - nums[i];
            int diff2 = nums[i + 2] - nums[i + 1];
            if (diff1 == 1 && diff2 == 1) {
                cond = true;
            }
        }
        return cond;
    }

}
