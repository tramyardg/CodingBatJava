package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class HaveThree {

    public boolean haveThree(int[] nums) {
        // to count the number of 3s
        int count = 0;
        boolean cond = false;
        
        // return false if the lenght is less
        // than three
        if (nums.length >= 3) {
            // iterate through the array 
            // determine if the 
            // index of that three is odd or even number
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 3) {        
                    
                    // if the first number is 3 this means this is 
                    // a multiple by 2 (even); [0, 2, 4] and 
                    // the next number must not equal to 3
                    if (nums[0] == 3 && nums[1] != 3) {
                        if (i % 2 == 0) {
                            count++;
                        }
                    }
                    
                    // if the second number is 3 this means this is 
                    // NOT a multiple by 2 (odd); [1, 3, 5] and 
                    // the next number must not equal to 3
                    if (nums[1] == 3 && nums[2] != 3) {
                        if (i % 2 != 0) {
                            count++;
                        }
                    }
                }
            }
            if (count == 3) {
                cond = true;
            }
        }
        return cond;
    }

}
