/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xabxxxcdx"));
    }
    
    public static String stringX(String str) {
        String res = "";
        // We don't care about the first and the last char
        // check only the chars between the first and the last char
        // to do these you can use the index
        // to limit yourself of the domain
        
        // in otherwords strip only the x starting from index 1 to 
        // string length - 1
        
        for(int i = 0; i < str.length(); i++) {
            //return the non-x character between the next to the first character and before
            //the last character
            
            //(i>0&&i<str.length()-1)
            // this is the range where you want to search for x if not equal to x
            // then return get the character, and move to the next one
            
            char ch = str.charAt(i);
            if(!(String.valueOf(ch).equals("x")&&(i>0&&i<str.length()-1))) {
                res = res + String.valueOf(ch);
            }
     
        }
        return res;
    }
    
    
}
