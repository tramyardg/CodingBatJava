package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Post4 {
    // return the aray that comes after the last 4
    // [4, 1, 4, 2] -> [2]
    // [4, 4, 1, 2, 3] -> {1,2,3}
    public int[] post4(int[] nums) {
        // convert the int array to string 
        // so that we can take advantage of
        // replaceAll function
        String str = Arrays.toString(nums);
        // replace all non digit numbers with nothing
        String newStr = str.replaceAll("\\D", "");
        // return the last occurence of #4
        int index4 = newStr.lastIndexOf("4");
        
        // use for new array, to avoid conflict
        int k = 0;
        
        int[] newArray = new int[(nums.length-index4)-1];
        // starts at the next number after 4
        for(int j = index4+1; j < nums.length; j++) {
            // store those numbers in an array
            newArray[k] = nums[j];
            k++;
        }
        return newArray;
    }
    
}
