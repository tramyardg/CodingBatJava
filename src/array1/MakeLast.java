/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MakeLast {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        System.out.println(Arrays.toString(makeLast(arr)));
    }
    public static int[] makeLast(int[] a){
        int doubleLenArr = a.length * 2; 
        int lastVal = a[a.length-1];
        int[] res = new int[doubleLenArr];
        res[res.length-1] = lastVal; 
        return res;
            
    }
}
