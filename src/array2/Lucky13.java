package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Lucky13 {
    public boolean lucky13(int[] nums) {
        boolean cond = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==1 || nums[i]==3) {
                cond = false;
            }
        }
        return cond;
    }
}
