package logic1;


/**
 *
 * @author RAYMARTHINKPAD
 */
public class InOrderEqual {
    
    public static void main(String[] args) {
        System.out.println(inOrderEqual(1,5,5,true));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean cond = false;
        if (a < b && b < c && a < c && (equalOk == false || equalOk == true)) {
            cond = true;
        } else if (a < c && b < c && a == b && equalOk == true) {
            cond = true;
        } else if (b > a && c > a && b == c && equalOk == true) {
            cond = true;
        } else if (a == b && b == c && c == a && equalOk == true) {
            cond = true;
        }
        return cond;
    }

}
