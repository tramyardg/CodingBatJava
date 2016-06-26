package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class IsEverywhere {

    // TO DO:
    public boolean isEverywhere(int[] nums, int val) {
        int count = 0;
        boolean cond = false;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i]==val && nums[i]<nums[i+1]) {
                count++;
            } 
        }
        double div = (double)nums.length/(double)count;
        cond = div%2==0;

        
        return cond;
    }

}
