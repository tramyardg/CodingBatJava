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
public class CountEvens {
//Return the number of even ints in the given array. 
//    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//
//countEvens({2, 1, 2, 3, 4}) → 3
//countEvens({2, 2, 0}) → 3
//countEvens({1, 3, 5}) → 0
    
    public int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0) {
                count++;
            }
        }
        return count;
    }
}
