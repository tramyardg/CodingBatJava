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
public class Has23 {
    //Given an int array length 2, return true if it contains a 2 or a 3.

    public boolean has23(int[] nums) {
        int numsLen = nums.length;
        if(numsLen>2&&numsLen<2) {
            return false;
        } else {
            
            if((nums[0]==2||nums[0+1]==2)||(nums[0]==3||nums[0+1]==3)) {
                return true;
            }
        }
        return false;
    }
}
