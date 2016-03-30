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
public class FrontPiece {
//Given an int array of any length, return a new array of its first 2 elements. 
//If the array is smaller than length 2, use whatever elements are present.
//
//frontPiece({1, 2, 3}) → {1, 2}
//frontPiece({1, 2}) → {1, 2}
//frontPiece({1}) → {1}
    public int[] frontPiece(int[] nums) {
        int numsLen = nums.length;
        if(numsLen>=2) {
            int[] arr = {nums[0], nums[1]};
            return arr;
        }
        return nums;
    }
}
