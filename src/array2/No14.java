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
public class No14 {
    public boolean no14(int[] nums) {
        boolean cond = true;
        /**
         * This is to count the number of 1s
         * and number of 4s in the array.
         * If the array contains at least one 
         * 1 and one 4 then return false.
         * 
         */
        int count1 = 0; int count4 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==1) {
                count1++;
            }
            if(nums[i]==4) {
                count4++;
            }
        }
        if(count1>=1&&count4>=1) {
            cond = false;
        }
        return cond; 
    }
}
