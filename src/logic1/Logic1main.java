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
public class Logic1main {
    public static void main(String[] args) {
//        BlueTicket bt = new BlueTicket();
//        System.out.println(bt.blueTicket(5, 15, 5));
//in1To10(5, false) → true	
//in1To10(11, false) → false	
//in1To10(11, true) → true	
//in1To10(10, false) → true	
//in1To10(10, true) → true	
//in1To10(9, false) → true	
//in1To10(9, true) → false
//in1To10(1, false) → true	
//in1To10(1, true) → true	
//in1To10(0, false) → false	
//in1To10(0, true) → true	
//in1To10(-1, false) → false	
        Int1To10 n = new Int1To10();
        System.out.println("5, false "+n.in1To10(5, false));
        System.out.println("11, false " + n.in1To10(11, false));
        System.out.println("11, true "+ n.in1To10(11, true));
        System.out.println("10, false "+n.in1To10(10, false));
        System.out.println("10, true " + n.in1To10(10, true));
        System.out.println("9, false " + n.in1To10(9, false));
        System.out.println("9, true " + n.in1To10(9, true));
        System.out.println("1, false " + n.in1To10(1, false));
        
        System.out.println("1, true " + n.in1To10(1, true));
        System.out.println("0, false " + n.in1To10(0, false));
        System.out.println("0, true " + n.in1To10(0, true));
        System.out.println("-1, false " + n.in1To10(-1, false));
    }
}
