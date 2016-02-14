package warmup1;

/**
 * Created by RAYMART on 2016-02-14.
 */
public class Makes10 {
    public static void main(String[] args) {
        System.out.println(makes10(9, 10));
    }

    //return true if one of them is 10
    //or their sum is 10

    public static boolean makes10(int a, int b) {
        int sum = a + b;
        if (sum == 10) {
            return true;
        } else if (a == 10 || b == 10) {
            return true;
        }
        return false;

        //you can merge the two condition without using a variable I guess
        //this makes your code shorter
        //return (((a + b) == 10) || ((a == 10) || (b == 10)));
    }
}
