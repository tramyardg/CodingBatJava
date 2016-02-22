package warmup2;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    /**
     * Note: Even if the ending index of a substring pass the length of
     * a string it will print from the starting index to the length
     * of a string
     * Ex. "xxbaaz" - length 6
     * "xxbaaz".substring(4,6)
     * Remember substring starts at 0
     *
     * @param str
     * @param str1
     * @return
     */
    public static int stringMatch(String str, String str1) {
        int count = 0;
        /*
            You can also use Math.min to find the shorter between the two
            strings.
         */
        int strLen;
        if (str.length() < str1.length()) {
            strLen = str.length();
        } else {
            strLen = str1.length();
        }
        for (int i = 0; i < strLen - 1; i++) {
            int a = i;
            int b = i + 2;
            if (str.substring(a, b).equals(str1.substring(a, b))) {
                count++;
            }
        }
        return count;
    }
}
