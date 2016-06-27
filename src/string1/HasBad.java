package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class HasBad {

    public boolean hasBad(String str) {
        String bad = "bad";
        if (str.length() > 3) {
            String s = str.substring(0, bad.length());
            String s2 = str.substring(1, bad.length() + 1);
            if (s.equals(bad) || s2.equals(bad)) {
                return true;
            }
        } else if (str.length() == bad.length() && str.equals(bad)) {
            return true;
        }
        return false;
    }

}
