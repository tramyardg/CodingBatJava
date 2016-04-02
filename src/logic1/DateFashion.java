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
public class DateFashion {
    /**
     * It's all about the order.
     * @param you
     * @param date
     * @return 
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }

    }
}
