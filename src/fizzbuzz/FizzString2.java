package fizzbuzz;

/**
 * Created by RAYMART on 2016-02-21.
 */
public class FizzString2 {
    public static void main(String[] args) {
        System.out.println(fizzString2(23));
    }

    public static String fizzString2(int n) {
        if ((n % 3) == 0 && (n % 5) == 0) {
            return "FizzBuzz";
        }
        if ((n % 3) == 0) {
            return "Fizz";
        }
        if ((n % 5) == 0) {
            return "Buzz";
        }
        return n + "!";
    }
}
