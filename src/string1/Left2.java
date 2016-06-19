package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Left2 {
    public static void main(String[] args) {
        System.out.println(left2("hi"));
    }
    public static String left2(String str) {
        String newStr = "";
        String first2 = str.substring(0, 2);
        if(str.length()>2) {
            newStr = str.substring(2, str.length())+first2;
        } else {
            newStr = str;
        }
        return newStr;
    }

}
