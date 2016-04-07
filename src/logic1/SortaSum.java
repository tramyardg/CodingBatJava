package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class SortaSum {
    public int sortaSum(int a, int b) {
        //return the original sum if the 
        //sum is less than 10.
        //ex. 3 + 4 = 7 < 10 return 7
        int addAB = a + b;
        if(addAB >= 10 && addAB <=19) {
        //Else if the sum is greater or
        //equal to 10 and less than or 
        //equal to 19 then return 20.
        //ex. 7 + 6 = 12 >= 10  || <= 19 return 20.
            addAB = 20;
        }
        return addAB;
    }
}
