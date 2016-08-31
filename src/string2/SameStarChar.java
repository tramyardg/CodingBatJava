package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class SameStarChar {

    public static void main(String[] agrs) {
//        String str = "*xa*a*a";
        String str = "12*2*3*";
//        System.out.println(sameStarChar(str));
        System.out.println(sameStarChar2(str));
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
    
    /**
     * 
     * @param str 
     * @return 
     */
	public static boolean sameStarChar2(String str) {
		// this is only to determine our starting index
		// and ending index if ever there are stars
		// in front and at the end of our string.
		// you can totally forget and starts at 1
		// and ends with string length - 1
		int startIndex = 0;
		int endIndex = str.length();
		if (str.charAt(0) == '*') {
			startIndex = 1;
		}
		if (str.charAt(str.length() - 1) == '*') {
			endIndex = str.length() - 1;
		}

		// we don't actually need to count the number
		// stars and the number of expected solution
		// just return right away
		if (str.length() >= 3) {
			for (int i = startIndex; i < endIndex; i++) {
				if (str.charAt(i) == '*') {
					if (str.charAt(i - 1) != str.charAt(i + 1)) {
						return false;
					}
				}
			}
		}

		return true;
	}
	
	public static boolean sameStarChar3(String str) {
		// this solution does not count the number of
		// expected pattern given the number of star
		// they focus directly from the second char
		// and the last char - 1
		for(int i = 1; i < str.length() - 1; i++) {
			if(str.charAt(i)=='*') {
				if(str.charAt(i-1)!=str.charAt(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
    
    
    
    
    
    
    
    
}
