/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Arrays;


/**
 *
 * @author RAYMARTHINKPAD
 */
public class Array2main {
    public static void main(String[] args) {
        WithoutTen w = new WithoutTen();
        int[] a = {1,10,10,2};//1,2,0,0
        System.out.println(": "+Arrays.toString(a) + "-> [1, 2, 0, 0]");

        System.out.println(Arrays.toString(w.withoutTen(a)));
        
    }
}
