package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class StartWord {

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "i"));
    }
    public static String startWord(String str, String word) {
        String newStr;
        if(str.substring(0, word.length()).equals(word)) {
            newStr = word;
        } else {
            newStr = str.substring(0, word.length());
        }
        return newStr;
    }

}
