package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Without2 {

    public String without2(String str) {
        if (str.length() > 1) {
            String last2 = str.substring(str.length() - 2, str.length());
            String first2 = str.substring(0, 2);
            if (last2.equals(first2)) {
                return str.substring(2, str.length());
            }
        }
        return str;
    }

}
