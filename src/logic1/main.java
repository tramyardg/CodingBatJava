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
public class main {
    public static void main(String[] args) {
        //    redTicket(2, 2, 2) → 10	
        //    redTicket(2, 2, 1) → 0	
        //    redTicket(0, 0, 0) → 5	
        //    redTicket(2, 0, 0) → 1
        RedTicket rt = new RedTicket();
        System.out.println(rt.redTicket(2, 2, 1));
    }
}
