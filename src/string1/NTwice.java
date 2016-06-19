package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class NTwice {

    public static void main(String[] args) {
        System.out.println(nTwice("Chocolate",1));
    }
    public static String nTwice(String str, int n) {
        String newStr = "";
        if(str.length()>=2) {
            newStr = str.substring(0, n)+str.substring(str.length()-n, str.length());
        } else {
            newStr = str;
        }
        return newStr;
    }

}
