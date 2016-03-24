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
public class MakeEnds {
        public int[] makeEnds(int[] nums) {
            int[] a2 = new int[2];
            int fe = nums[nums.length-nums.length];
            int le = nums[nums.length-1];
            a2[0] = fe;
            a2[1] = le;
            return a2;
        }
}
