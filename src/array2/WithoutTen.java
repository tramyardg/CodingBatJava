package array2;

import java.util.ArrayList;
/**
 *
 * @author RAYMARTHINKPAD
 */
public class WithoutTen {

    public int[] withoutTen(int[] nums) {
        int[] newArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++)  {
            // this will return number not equal to 10
            if (nums[i] != 10) {
                // store those number in the new array
                newArr[j] = nums[i];
                j++;
            }
            
        }
        
        return newArr;
    }
   
}
