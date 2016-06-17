package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ZeroMax {

    public int[] zeroMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                
                    if(nums[i+1]%2!=0) {
                        nums[i]=nums[i+1];
                        
                    }
                
            }
        }
        return nums;
    }

}
