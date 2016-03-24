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
public class MaxEnd3 {
    public int[] maxEnd3(int[] arr) {
        int[] a3 = new int[arr.length];
        int fe = arr[arr.length-arr.length];
        int le = arr[arr.length-1];
        for(int i = 0; i<arr.length; i++) {
            if(fe>le){
                a3[i] = fe;
            }else {
                a3[i] = le;
            }
        }
        return a3;
    }
    
}
