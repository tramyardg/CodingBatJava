package warmup1;

/**
 * Created by RAYMART on 2016-02-12.
 */
public class Diff21 {
    public static void main(String[] args) {
        System.out.println("diff21(23) --> " + diff21(23));
    }
    /*
    given an int n, return the absolute difference between n and 21
    except return double the absolute difference if n is over 21

    e.g.
        diff21(19) --> 2
        diff21(21) --> 0
     */

    public static int diff21(int givenInt){
        //check if givenInt is less than or bigger than 21
        //make a constant 21;
        int constant21 = 21;
        int newInt = 0;
        if(givenInt==constant21) {
            return 0;
        }
        if(givenInt < constant21 ) {
            newInt = constant21 - givenInt;
        } else {
            newInt = 2*(givenInt - constant21);
        }
        return newInt;
    }
}
