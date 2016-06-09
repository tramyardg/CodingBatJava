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
public class RedTicket {


    public int redTicket(int a, int b, int c) {
        int result = 0;
        if(a==2&&b==2&&c==2) {
            result = 10;
        } else if(a==b&&b==c&&c==a) {
            result = 5;
        } else if(a!=b && a!=c ) {
            result = 1;
        }
        
        return result;
    }

}
