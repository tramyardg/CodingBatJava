package recursion1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Factorial {

    public int factorial(int n) {
        /**
         * If the given number is 1 which is the base case.
         */
        if (n == 1) {
            return 1;
        }
        /**
         * Think about stacking.
         */
        return n * factorial(n-1);
    }
}
