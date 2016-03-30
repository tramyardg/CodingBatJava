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
public class Sum2 {

    public int sum2(int[] nums) {
        int sum;
        int length0 = 0;
        int numsLen = nums.length;
        if (numsLen >= 2) {
            sum = nums[0] + nums[1];
            return sum;
        } else if (numsLen == 1) {
            int less2 = nums[0];
            return less2;
        }

        return length0;
    }

}
