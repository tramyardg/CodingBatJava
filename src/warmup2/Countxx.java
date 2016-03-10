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
public class Countxx {
    public static void main(String[] args) {
        System.out.println(countXX("xxx"));
    }
    
    public static int countXX(String str) {
        String x = "x";
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(i < str.length() - 1) {
                String firstX = String.valueOf(str.charAt(i));
                String secondX= String.valueOf(str.charAt(i+1));
                if(firstX.equals(x)&&secondX.equals(x)) {
                    count++;
                }   
            }
        }
        return count;
    }
}
