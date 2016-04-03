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
public class EndsLy {

    public boolean endsLy(String str) {

        if (str.length() >= 2) {
            /**
             * You cannot do this unless the length of your
             * string is >=2. Therefore, it should be inside this
             * if statement.
             */
            String ly = String.valueOf(str.charAt(str.length() - 2))
                    + String.valueOf(str.charAt(str.length() - 1));
            if (ly.endsWith("ly")) {
                return true;
            }
        }

        return false;
    }
}
