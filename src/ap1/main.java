/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class main {
    public static void main(String[] args) {
     
        ScoresAverage sa = new ScoresAverage();
        int[] scores = {3, 4, 5, 1, 2, 3};
        System.out.println(sa.scoresAverage(scores));
    }
}
