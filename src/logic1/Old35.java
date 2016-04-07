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
public class Old35 {

    public boolean old35(int n) {
        if (n > 0) {
            if (n % 3 == 0 && n % 5 == 0) {
                return false;
            } else if(n % 3 == 0 || n % 5 == 0) {
                return true;
            }
        }
        return false;
    }
}
