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
public class PlusTwo {

    public int[] plusTwo(int[] a, int[] b) {
        int[] ar = new int[a.length + b.length];

        ar[0] = a[0];
        ar[1] = a[1];
        ar[2] = b[0];
        ar[3] = b[1];

        return ar;
    }
}
