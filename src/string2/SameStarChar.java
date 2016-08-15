package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class SameStarChar {

    public static void main(String[] agrs) {
        String str = "*xa*a*a";
        System.out.println(sameStarChar(str));
    }

    /**
     * Start at 1 and end at string length - 1 since
     * we only care about the characters between
     * these interval.
     * 
     * Return true if the string does not contain
     * a star or the length of the string is less then 
     * or equal to 3.
     * 
     * Count the number of stars from the string.
     * If there are two stars then there should be
     * two patterns in there, otherwise return false 
     * (if there are two stars but only one pattern then
     * return false).
     * @param str
     * @return 
     */
    public static boolean sameStarChar(String str) {
        int count = 0;
        int count2 = 0;
        boolean cond = false;
        if (str.length() <= 3 || !str.contains("*")) {
            cond = true;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*")) {
                count++; // count the number of stars
                if (String.valueOf(str.charAt(i - 1)).equals(String.valueOf(str.charAt(i + 1)))) {
                    count2++; // count the number of patterns
                    cond = true;
                }
            }
        }
        if (count != count2) {
            cond = false;
        }
        return cond;
    }
}
