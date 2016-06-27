package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class StartWord {

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
    }

    public static String startWord(String str, String word) {
        String s = "";
        // the str length must be greater than
        // or equal to the word length so that 
        // we can use substring starting at 1
        if (str.length() >= word.length()) {
            String wordStr = word.substring(1, word.length());
            String strSubs = str.substring(1, word.length());
            if (wordStr.equals(strSubs)) {
                s = str.substring(0, word.length());
            }
        }
        return s;
    }

}
