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
public class BlueTicket {

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (a <= 10 && b <= 10 && c <= 10) {
            if (ab == 10 || bc == 10 || ac == 10) {
                return 10;
            }
            return 0;
        } 
        if(ab>bc) {
            return 5;
        } else {
            return 10;
        }
    }

}
