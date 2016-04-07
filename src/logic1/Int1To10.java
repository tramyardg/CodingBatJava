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
public class Int1To10 {

    public boolean in1To10(int n, boolean outsideMode) {
        if (n < 1 || n > 10) {
            /**
             * If the number is less than 1 or greater than 10 
             * the condition is false return false,
             * otherwise return true.
             */
            if (!outsideMode) {
                return false;
            } else {
                return true;
            }
        } else if (n == 1 || n == 10) {
            /**
             * If the number is equal to 1 or equal to 10
             * either way return true.
             */
            if (!outsideMode || outsideMode) {
                return true;
            }
        } else if (n > 1 && n < 10) {
            /**
             * If the number is between 1 and 10 exclusive
             * and the condition is false then return true,
             * otherwise return false.
             */
            if (!outsideMode) {
                return true;
            } else {
                return false;
            }
        } 
        return false;
    }
}

//in1To10(5, false) → true	
//in1To10(11, false) → false	
//in1To10(11, true) → true	
//in1To10(10, false) → true	
//in1To10(10, true) → true	
//in1To10(9, false) → true	
//in1To10(9, true) → false
//in1To10(1, false) → true	
//in1To10(1, true) → true	
//in1To10(0, false) → false	
//in1To10(0, true) → true	
//in1To10(-1, false) → false	
