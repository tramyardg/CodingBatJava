package string1;

/**
 *
 * @author r_degu
 */
public class MinCat {

//  Given two strings, append them together (known as "concatenation") and return the result. 
// However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
//    So "Hello" and "Hi" yield "loHi". The strings may be any length.
    public static void main(String[] args) {
        String a = "java";
        String b = "Hello";
        System.out.println(minCat(a, b));
    }

    // minCat("x", "abc") → "xc"	
    public static String minCat(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        String newStr = "";
        if (aLen > bLen) {
            newStr = a.substring(a.length() - b.length(), a.length()).concat(b);
        } else if (aLen < bLen) {
            newStr = a.concat(b.substring(b.length() - a.length(), b.length()));
        } else if (aLen == bLen) {
            newStr = a.concat(b);
        }
        return newStr;
    }

}
