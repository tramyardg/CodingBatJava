/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup1;

/**
 *
 * @author r_degu
 */
public class MonkeyTrouble {
    public static void main(String[] args){
        System.out.println(monkeyTrouble(false, true));
    }
    
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }
}
