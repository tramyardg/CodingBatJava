package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("H"));
    }
    public static String extraFront(String str) {
        String newStr;
        if(str.length()>=2) {
            newStr = str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
        } else {
            newStr = str+str+str;
        }
        return newStr;
    }

}
