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
public class LastChars {

    public String lastChars(String a, String b) {
        String res;
        
        if(a.length()>0&&b.length()>0) {
            res = a.substring(0,1) + b.substring(b.length()-1);
        } else {
            res = "@"+"@";
        }
        if(a.length()==0 && b.length()>0) {
            res = "@"+b.substring(b.length()-1);
        } else if (a.length()>0 && b.length()==0){
            res = a.substring(0,1)+"@";
        } 
        return res;
    }

}
