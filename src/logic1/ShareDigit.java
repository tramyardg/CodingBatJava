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
public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        int leftDigitA = a / 10;
        int leftDigitB = b / 10;
        int rightDigitA = a % 10;
        int rightDigitB = b % 10;
        if (leftDigitA == leftDigitB) {
            return true;
        } else if (leftDigitA == rightDigitB) {
            return true;
        } else if (rightDigitA == leftDigitB) {
            return true;
        } else if (rightDigitA == rightDigitB) {
            return true;
        }
        return false;
    }

}
