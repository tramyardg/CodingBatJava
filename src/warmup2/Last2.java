package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("xxxx"));
        //System.out.println("hixxhi".substring("hixxhi".length()-2)); //hi
    }

    /**
     * @param str
     * @return the number of times the last two chars is equals to the first two chars of
     * a string
     * Ex. "hixxhi" yields 1
     */
    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String end = str.substring(str.length() - 2);
        // Note: substring with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at 1
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }
}
