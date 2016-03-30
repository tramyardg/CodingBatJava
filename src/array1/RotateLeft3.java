/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
        int[] arr1 = {-1};
        
        System.out.println("num length " + nums.length);
        System.out.println("num  " + Arrays.toString(nums));
        if (nums.length == 3) {
            int[] arr = {nums[0 + 1], nums[0 + 2], nums[0]};

            return arr;
        }
        return arr1;
    }

}
