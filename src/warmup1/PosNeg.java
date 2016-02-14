/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingjav;

/**
 *
 * @author r_degu
 */
public class PosNeg {
    public static void main (String[] args){
        System.out.println(posNeg(-1,1,true));
    }
    
    public static boolean posNeg(int a, int b, boolean cond) {
        
        if(((a<0&&b<0))) {
            if(cond) {
                return true;    
            } else {
                return false;
            }
            
        } 
        if((a<0||b<0)) {
            if(!cond) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
