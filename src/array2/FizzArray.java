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
public class FizzArray {
    public int[] fizzArray(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i]=i;
        }
        return array;
    }
}
