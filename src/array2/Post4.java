/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Post4 {
    // return the aray that comes after the last 4
    // [4, 1, 4, 2] -> [2]
    public int[] post4(int[] nums) {
        // convert the int array to string 
        // so that we can take advantage of
        // replaceAll function
        String str = Arrays.toString(nums);
        // replace all non digit numbers with nothing
        String newStr = str.replaceAll("\\D", "");
        // return the last occurence of #4
        int index4 = newStr.lastIndexOf("4");
        
        int k = 0;
        int[] newArray = new int[(nums.length-index4)-1];
        for(int j = index4+1; j < nums.length; j++) {
            newArray[k] = nums[j];
            k++;
        }
        return newArray;
    }
    
}
