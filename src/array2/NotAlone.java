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
public class NotAlone {

    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            // val must not be equal to the last element
            // and also the first element of the array 
            if (nums[i] == val && i != nums.length - 1 && i != 0) {
                if (val != nums[i - 1] && val != nums[i + 1]) {
                    if (nums[i + 1] > val && nums[i + 1] > nums[i - 1]) {
                        nums[i] = nums[i + 1];
                    }
                    if (nums[i - 1] > val && nums[i - 1] > nums[i + 1]) {
                        nums[i] = nums[i - 1];
                    }
                }

            }
        }
        return nums;
    }

}
