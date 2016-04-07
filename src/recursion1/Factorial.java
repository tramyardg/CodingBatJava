/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Factorial {

    public int factorial(int n) {
        /**
         * If the given number is 1 which is the base case.
         */
        if (n == 1) {
            return 1;
        }
        /**
         * Think about stacking.
         */
        return n * factorial(n-1);
    }
}
