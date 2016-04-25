package logic1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class FizzString {

    public String fizzString(String str) {
        String newStr = "";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar == 'f') {
            newStr = "Fizz";
        } else if (lastChar == 'b') {
            newStr = "Buzz";
        } else {
            newStr = str;
        }

        if (firstChar == 'f' && lastChar == 'b') {
            newStr = "FizzBuzz";
        }
        return newStr;
    }

}
