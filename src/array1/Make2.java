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
public class Make2 {

    public int[] make2(int[] a, int[] b) {
        if (this.arrLength(a) == 0 && this.arrLength(b) >= 2) {
            int[] ar = {b[0], b[1]};
            return ar;
        }
        if (this.arrLength(b) == 0 && this.arrLength(a) >= 2) {
            int[] ar = {a[0], a[1]};
            return ar;
        }

        if (this.arrLength(a) >= 1 && this.arrLength(b) >= 1) {
            if (this.arrLength(a) >= 2) {
                int[] ar = {a[0], a[1]};
                return ar;
            }

            int[] ar = {a[0], b[0]};
            return ar;
        } else {
            int[] ar = {};
            return ar;
        }

    }

    public int arrLength(int[] nums) {
        return nums.length;
    }
}
