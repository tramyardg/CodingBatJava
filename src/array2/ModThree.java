/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ModThree {
    /**
     * Given an array of ints, return true if the array contains either 3 
     * even or 3 odd values all next to each other.
     * modThree([2, 1, 3, 5]) → true
     * modThree([2, 1, 2, 5]) → false
     * modThree([2, 4, 2, 5]) → true
     * @param nums
     * @return 
     */
    public boolean modThree(int[] nums) {
        boolean cond = false;
        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i]%2==0 ) {
                if(nums[i+1]%2==0 ) {
                    if(nums[i+2]%2==0 ) {
                        cond = true;
                    }
                }
            }
            if(nums[i]%2!=0 ) {
                if(nums[i+1]%2!=0 ) {
                    if(nums[i+2]%2!=0 ) {
                        cond = true;
                    }
                }
            }
        }
        return cond;
    }
}
