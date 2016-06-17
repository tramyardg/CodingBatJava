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
public class Array667 {
    public static void main(String[] args) {
        int[] arr = {6,6,2};
        System.out.println(array667(arr));
    }
    
    public static int array667(int[] a) {
        int number6 = 6;
        int count = 0;
        int number7 = 7;
        int nextTo6;
        for(int i = 0; i < a.length-1; i++) {
            nextTo6 = a[i+1];
            if(a[i]==number6) {
                if(nextTo6==number7 || nextTo6==number6) {
                    count++;
                }
            }
        }
        return count;
    }
}
