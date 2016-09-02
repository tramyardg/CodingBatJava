package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class XYZthree {

    public static void main(String[] args) {
//        xyzThere("abcxyz") → true
//        xyzThere("abc.xyz") → false
//        xyzThere("xyz.abc") → true
        String str = "abc.xyz";
        System.out.println(xyzThree(str));
//        System.out.println(str.indexOf("x"));
    }

    public static boolean xyzThree(String str) {
        if (str.length() > 3) {
            for (int i = 0; i < str.length() - 2; i++) {
                // return true if xyz if found the at the back and the char before x is not period
                if (str.indexOf("x") > 0 && str.charAt(i) == 'x' && str.charAt(i - 1) != '.') {
                    if (str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                        return true;
                    }
                }
//                 return true if xyz is found in the front
                if (str.indexOf(".") > str.indexOf("x")) {
                    if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                        return true;
                    }
                }

            }
        } else if (str.length() == 3 && str.equals("xyz")) {
            return true;
        }
        return false;
    }
}
