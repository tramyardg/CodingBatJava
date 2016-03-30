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
public class SwapEnds {
//    Given an array of ints, swap the first and last elements in the array. 
//    Return the modified array. The array length will be at least 1.
//
//    swapEnds({1, 2, 3, 4}) → {4, 2, 3, 1}
//    swapEnds({1, 2, 3}) → {3, 2, 1}
//    swapEnds({8, 6, 7, 9, 5}) → {5, 6, 7, 9, 8}

    public int[] swapEnds(int[] nums) {
        int firstElem = nums[0];
        int lastElem = nums[nums.length - 1];
        nums[0] = lastElem;
        nums[nums.length - 1] = firstElem;
        return nums;
    }
}
