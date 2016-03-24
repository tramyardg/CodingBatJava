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
public class Main {

    public static void main(String[] args) {

        MaxEnd3 m = new MaxEnd3();
        int[] arr = {2, 11, 3, 9};
//        System.out.println(Arrays.toString(m.maxEnd3(arr)));
        
        MakeEnds me = new MakeEnds();
//        System.out.println(Arrays.toString(me.makeEnds(arr)));
        
        PlusTwo pt = new PlusTwo();
        int[] a = {1,2}; int[] b = {3,4};
//        System.out.println(Arrays.toString(pt.plusTwo(a, b)));
        
        MaxTriple mt = new MaxTriple();
        System.out.println(mt.maxTriple(arr));
    }
}
