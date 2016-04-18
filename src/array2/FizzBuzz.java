package array2;

import java.util.Arrays;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        
        // the new length of our String array is the end - 1
        int newLength = end - 1;

        String[] strArr = new String[newLength];

        for (int i = 0; i < newLength; i++) {
            // since we start by one add 1 to the index
            int startNum1 = i+start;
            // compare index which starts with 1 to 
            // 3 and 5
            // Example:
            // given start: 1, end: 5, we have
            // [1 2 3 4] -> original array without "fizz" or
            // "buzz"
            // 1 % 3 == 0 ? = false 
            // 2 % 3 == 0 ? = false 
            // 3 % 3 == 0 ? = true -> add "fizz" at index
            // same applies for multiple of 5
            if (startNum1 % 3 == 0) {
                strArr[i] = fizz;
            } else if (startNum1 % 5 == 0) {
                strArr[i] = buzz;
            } else {
                strArr[i] = String.valueOf(startNum1);
            }
            
        }
        return strArr;

    }
}
