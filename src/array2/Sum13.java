/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Sum13 {
//Return the sum of the numbers in the array, returning 0 for an empty array. 
//Except the number 13 is very unlucky, so it does not count and 
//numbers that come immediately after a 13 also do not count.
//
//sum13({1, 2, 2, 1}) → 6
//sum13({1, 1}) → 2
//sum13({1, 2, 2, 1, 13}) → 6

    public int sum13(int[] nums) {
        int count = 0;
        if (nums.length < 1) {
            return 0;
        } else {

            for (int i = 0; i < nums.length; i++) {
                /**
                 * If number 13 is located before the last 2 elements of the
                 * array, then apply 0 for both the index 13 and the index after
                 * 13 Example: { 1, 2, 13, 4, 2, 1} -> { 1, 2, 0, 0, 2, 1 }
                 */
                if (nums[i] == 13) {
                    if (i < nums.length - 1) {
                        System.out.println("you are here");
                        nums[i] = 0;
                        nums[i + 1] = 0;
                    }
                }
                /**
                 * this works if number 13 is at the last element or if 13 in
                 * not present at all in the array
                 */
                if (nums[i] != 13) {
                    count += nums[i];
                }
                /**
                 * Or you can do this.
                   if (nums[i] != 13) {
                       count += nums[i];
                   } else {
                       i++;
                   }
                 */
                
            }
            return count;
        }
    }

}
