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
public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        int addAB = a + b;
        int addBC = b + c;
        int addAC = a + c;
        
        
        return addAC==b||addBC==a||addAB==c;
    }
    
   
}
