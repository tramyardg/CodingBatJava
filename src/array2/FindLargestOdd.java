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
public class FindLargestOdd {
    public static void main(String[] args) {
        
        int[] oddnums = {1,2,5,3,9,7,13,21,15,4,6};
        int oddMax = largestOdd(oddnums);
        System.out.println(oddMax);
    }
    public static int largestOdd(int[] nums) {
        // given an array find the largest odd number
        int oddmax = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0) {
                if(nums[i]>oddmax) {
                    oddmax = nums[i];
                }
            }
        }
        return oddmax;
    }
}
