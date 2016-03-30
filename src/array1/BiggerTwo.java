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
public class BiggerTwo {
//    Start with 2 int arrays, a and b, each length 2. 
    //Consider the sum of the values in each array. 
    //Return the array which has the largest sum. In event of a tie, return a.
//
//biggerTwo({1, 2}, {3, 4}) → {3, 4}
//biggerTwo({3, 4}, {1, 2}) → {3, 4}
//biggerTwo({1, 1}, {1, 2}) → {1, 2}
    
    public int[] biggerTwo(int[] nums1, int[] nums2) {
        int firstSum = this.sumArr(nums1);
        int secondSum = this.sumArr(nums2);
        if(firstSum!=secondSum) {
            if(firstSum>secondSum) {
                return nums1;   
            } else {
                return nums2;
            }
        } 
        return nums1;
    }
    
    public int sumArr(int[] nums) {
        int sum;
        int n0 = nums[0];
        int n1 = nums[1];
        sum = n0+n1;
        return sum;
    }
    
    
}
