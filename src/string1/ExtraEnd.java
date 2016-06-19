package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ExtraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("hi"));
    }
    public static String extraEnd(String str) {
        String newStr;
        String last2 = str.substring(str.length()-2, str.length());
        if(str.length()>=2) {
            newStr = last2+last2+last2;
        } else {
            newStr = str+str+str;
        }
        return newStr;
    }

}
