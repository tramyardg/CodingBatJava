package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class NTwice {

    public static void main(String[] args) {
        System.out.println(nTwice("Chocolate", 3));
    }

    public static String nTwice(String str, int n) {
        String newStr = "";
        // The string length will be at least n
        // at least means >=
        if (str.length() >= n) {
            // remember substring starts at 0
            // but it ends with last index - 1
            // so 'chocolate'.substring(0, 3)
            // returns (c_h_o_c -> 0,1,2,3) = 'cho'
            newStr = str.substring(0, n) + str.substring(str.length() - n, str.length());
        }
        return newStr;
    }
}
