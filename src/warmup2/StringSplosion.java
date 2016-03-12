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
public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("There"));
    }
    
    public static String stringSplosion(String str){        
        String res = "";
        for(int i = 0; i < str.length()-1; i++) {
            res += str.substring(0, i+1);
        }
        return res+str;
    }
}
