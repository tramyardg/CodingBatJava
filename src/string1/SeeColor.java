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
public class SeeColor {

    /**
     *   seeColor("redxx") → "red"
     *   seeColor("xxred") → ""
     *   seeColor("blueTimes") → "blue"
     * @param str
     * @return 
     */
    public String seeColor(String str) {
        String res = "";
        if (str.length() > 2) {
            if (str.length() >= 3 && "red".equals(str.substring(0, 3))) {
                res = "red";
            }
            if (str.length() >= 4 && "blue".equals(str.substring(0, 4))) {
                res = "blue";
            }
        } else {
            res = "";
        }

        return res;
    }

}
