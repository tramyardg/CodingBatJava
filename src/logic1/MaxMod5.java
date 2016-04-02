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
public class MaxMod5 {

    public int maxMod5(int a, int b) {
        int amod = a%5;
        int bmod = b%5;
        if(a == b) {
            return 0;
        } 
        
        if(a > b && amod!=bmod) {
            return a;
        }
        if(a<5 && b<5) {
            if(amod < bmod) {
                return b;
            }
            return a;
        } else {
            if(a < b && (amod==bmod)) {
                return a;
            }
            return b;
        }
    }
}
