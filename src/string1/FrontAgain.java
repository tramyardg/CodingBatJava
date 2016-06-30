package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class FrontAgain {

    public boolean frontAgain(String str) {
        boolean cond = false;
        if (str.length() == 2) {
            cond = true;
        }
        if (str.length() > 2) {
            String last2 = str.substring(str.length() - 2, str.length());
            String first2 = str.substring(0, 2);
            if (last2.equals(first2)) {
                cond = true;
            }
        }
        return cond;
    }

}
