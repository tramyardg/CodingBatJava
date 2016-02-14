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
public class FrontBack {
    public static void main(String[] args) {
        
         System.out.println(frontBack("ba"));
    }
    
    public static String frontBack(String str) {
        if(str.length()> 1) {
            int strLen = str.length() - 1;

            char lastChar = str.charAt(strLen);
            char firstChar = str.charAt(0);

            String mid = str.substring(1, strLen);

            return lastChar+mid+firstChar;
        } 
        return str;
    
    }
    
}
