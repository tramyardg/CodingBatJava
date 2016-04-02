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
public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int amod = a%10;
        int bmod = b%10;
        int cmod = c%10;
        
        return (amod==bmod || amod==cmod || bmod==cmod);
            
    }
}
