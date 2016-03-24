/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MaxTriple {

    public int maxTriple(int[] arr) {

        int max = 0;
        int notOddLen = -1;
        int arrLen = arr.length;
        int fe = arr[arr.length-arr.length];
        int le = arr[arr.length-1];
        
        int m = arr[(arrLen-1)/2];
        int[] nArr = {fe, m, le};
        
        
        if((arrLen%2)!=0) {
            for(int i = 0; i < nArr.length; i++) {
                if(nArr[i]>max) {
                    max = nArr[i];
                }
            }
            return max;
        }
        return notOddLen;
    }

}
