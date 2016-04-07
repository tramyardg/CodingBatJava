/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class TeenSum {

    public int teenSum(int a, int b) {
        if (a <= 10 && b > 10) {
            if ((b % 10) >= 1) {
                return 19;
            }
            return a + b;

        }
        if (a > 10 && b <= 10) {
            /**
             * 12 is special number because it is not considered teens. ex. 12 +
             * 4 = 16 Returns 16 instead of 19.
             */
            if ((a % 10) >= 1 && (a % 10) != 2) {
                return 19;
            }
            return a + b;

        }
        if (a <= 10 && b <= 10) {
            return a + b;
        }
        return 19;
    }
}
