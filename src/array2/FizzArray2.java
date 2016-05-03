package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] newStrArr = new String[n];
        for(int i = 0; i < n; i++) {
            newStrArr[i]= String.valueOf(i);
        }
        return newStrArr;
    }

}
