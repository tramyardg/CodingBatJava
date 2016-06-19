package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class WithoutEnd {

    public static void main(String[] args) {
        System.out.println(withoutEnd("co"));
    }
    public static   String withoutEnd(String str) {
        String newStr = "";
        if(str.length()>=2) {
            newStr = str.substring(1,str.length()-1);
        } else {
            newStr = str;
        }
        return newStr;
    }

}
