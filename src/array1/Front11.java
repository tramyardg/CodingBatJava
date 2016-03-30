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
public class Front11 {
//    Given 2 int arrays, a and b, of any length, return a new array 
//    with the first element of each array. If either array is length 0, ignore that array.
//
//    front11({1, 2, 3}, {7, 9, 8}) → {1, 7}
//    front11({1}, {2}) → {1, 2}
//    front11({1, 7}, {}) → {1}
    public int[] front11(int[] a, int b[]){
        int[] ar0 = {};
        if(this.getArrLength(a)>=1) {
            if(this.getArrLength(b)==0) {
                int[] ar = {this.firstElemArr(a)};
                return ar;
            }
        }
        if(this.getArrLength(b)>=1) {
            if(this.getArrLength(a)==0) {
                int[] ar = {this.firstElemArr(b)};
                return ar;
            }
        }
        if(this.getArrLength(a)>=1&&this.getArrLength(b)>=1) {
            int[] ar = {this.firstElemArr(a), this.firstElemArr(b)};
            return ar;
        } else {
            return ar0;
        }
    }
    
    public int firstElemArr(int[] nums) {
        int fe = nums[0];
        return fe;
    }
    
    public int getArrLength(int[] nums) {
        return nums.length;
    }
}
