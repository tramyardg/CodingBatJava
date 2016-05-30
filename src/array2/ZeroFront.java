package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ZeroFront {

    public int[] zeroFront(int[] nums) {
        // [ 0, 1, 1, 0, 1 ] -> [ 0, 0, 1, 1, 1 ]
        System.out.println(Arrays.toString(nums));
        int[] newArray = new int[nums.length];
        
        // all zeros are shifted to the left
        // starting at 0 index
        int zeroPos = 0;
        
        // filling the new array with nonzero values
        // starts at the last index
        int nonZeroPos = nums.length - 1;
        
        for(int i = 0; i < nums.length; i++) {
            // finds the zeros in the array
            if(nums[i]==0) {
                // zeroPos increment is equal to the number of zeros
                // in the array. for example, if there are two zeros
                newArray[zeroPos++] = 0;
                System.out.println("zeroPos "+zeroPos);
            } else {
                newArray[nonZeroPos--] = nums[i];
                System.out.println("nonZeroPos "+nonZeroPos);

            }
        }
        return newArray;
        
    }
    

}

