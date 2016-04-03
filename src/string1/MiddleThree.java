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
public class MiddleThree {

    public String middleThree(String str) {
        if (str.length() >= 3) {
            /**
             * This is to get the middle char. 
             * From there we can use substring 
             * to get the char before the middle
             * and the char next to middle.
             * 
             * We cannot use charAt since it 
             * considers duplicate char.
             */
            int mid = ((str.length() / 2) + 1);
            
            String b = str.substring(mid-2, mid+1);
           
            return b;
        }
        return str;

    }
}
