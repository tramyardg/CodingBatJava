/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Double23 {
    //Given an int array, return true if the array contains 2 twice, or 3 twice. 
    //The array will be length 0, 1, or 2. 

    
    public boolean double23(int[] nums) {
        int numsLen = nums.length;
        if(numsLen == 2) {
            int n0 = nums[0];
            int n1 = nums[1];
            if((n0==2&&n1==2)||(n0==3&&n1==3)) {
                return true;
            }
        } else if(numsLen==1) {
                return false;
        }
        return false;
    }
}
