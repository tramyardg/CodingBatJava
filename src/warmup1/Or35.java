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
public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(8));
    }
    
    public static boolean or35(int n) {
        if(n > 0) {
            if((n%3==0) || (n%5==0)) {
                return true;
            }
        }
        return false;
    }
    
}
