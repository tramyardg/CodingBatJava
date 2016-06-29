package string1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ConCat {

    public static void main(String[] args) {
        System.out.println(conCat("pig", "g"));
    }

    public static String conCat(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            String lastCharA = a.substring(a.length() - 1, a.length());
            String firstCharB = b.substring(0, 1);
            if (lastCharA.equals(firstCharB)) {
                return a.concat(b.substring(1));
            }
        }
        return a.concat(b);
    }

}
