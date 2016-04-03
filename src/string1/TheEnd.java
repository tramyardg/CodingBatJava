/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front) {
            return String.valueOf(str.charAt(0));
        } else {
            return String.valueOf(str.charAt(str.length()-1));
        }
    }
}
