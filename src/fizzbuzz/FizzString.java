package fizzbuzz;

/**
 * Created by RAYMART on 2016-02-21.
 */
public class FizzString {
    public static void main(String[] args) {
        System.out.println(fizzBuzz("fb"));
    }

    public static String fizzBuzz(String str) {
        //Note: You have to put the other condition
        //If the string starts with f but does not ends with b
        if (str.startsWith("f") && (!str.endsWith("b"))) return "Fizz";
        if (str.endsWith("b") && (!str.startsWith("f"))) return "Buzz";
        if (str.startsWith("f") && str.endsWith("b"))
            return "FizzBuzz";
        if (!(str.startsWith("f") && str.endsWith("b")))
            return str;
        return str;
    }

}
