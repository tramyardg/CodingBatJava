/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ArrayFront9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,4};
        System.out.println(arrayFront9(arr));
    }
    
    public static boolean arrayFront9(int[] a) {
        boolean cond = false;
        int number9 = 9;
        int searchStart = 0;
        int searchEnd = 3;

        for(int i = 0; i < a.length; i++) {
            if(i <= searchEnd && a[i]==number9) {
                cond = true;
            }
        } 

        return cond;
    }
}
