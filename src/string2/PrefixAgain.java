package string2;

public class PrefixAgain {

    public static void main(String[] args) {
        String str = "abXYabc";
//        System.out.println(prefixAgain(str, 3));
        System.out.println(prefixAgain2(str, 2));
    }

    public static boolean prefixAgain(String str, int n) {
        if (str.length() < n) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(n - 1, n).equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        // if statement is redundant here
        // can be written as
        // return count > 1
        // means return true if count is greater than 1
        // if count is less than 1, then return false;
        if (count > 1) {
            return true;
        }
        return false;
    }
    
    /**
     * Shortened version.
     * @param str
     * @param n
     * @return 
     */
    public static boolean prefixAgain2(String str, int n) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(n - 1, n).equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        return count > 1;
    }
}
