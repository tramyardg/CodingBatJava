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
        WithoutTen wt = new WithoutTen();
        int[] nums = {10,2,2,10};
        System.out.println(Arrays.toString(wt.withoutTen(nums)));
                
    }

    
}
