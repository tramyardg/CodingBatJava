package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class RepeatSep {

    public String repeatSeparator(String word, String sep, int count) {
        String newStr = "";
        String sep1 = "";
        for (int i = 0; i < count; i++) {
            newStr += word + sep;
        }
        return newStr.substring(0, newStr.length() - sep.length());
    }

}
