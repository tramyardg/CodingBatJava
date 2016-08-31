package string2;

public class CountCode {

    public static void main(String[] args) {
        String str = "coAcodeBcoleccoreDD";
        System.out.println(countCode(str));
    }

    public static int countCode(String str) {
        int count = 0;
        if (str.length() <= 3) {
            return count;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("c") && i <= str.length() - 4) {
                if (str.substring(i + 1, i + 2).equals("o")) {
                    if (str.substring(i + 3, i + 4).equals("e")) {
                        count++;
                    }
                }
            }
            
            
        }
        
        
        
        return count;
    }
    
    /**
     * Alternate solution using charAt.
     * This is shorter and less complicated.
     * @param str
     * @return 
     */
    public static int countCode2(String str) {
        int count2 = 0;
        if(str.length() > 3) {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                    count2++;
                }
            }
        } 
        return count2;
    }
}
