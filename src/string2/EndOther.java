package string2;

public class EndOther {

    public static void main(String[] args) {
        String stra = "abc";
        String strb = "abXabc";
        System.out.println(endOther(stra, strb));
        System.out.println("endOther2: " + endOther2("abc", "abXabc"));
    }

    public static boolean endOther(String a, String b) {
        String lca = a.toLowerCase();
        String lcb = b.toLowerCase();
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            if (lca.substring((lenA - lenB), lenA).equals(lcb)) {
                return true;
            }
        }
        if (lenA < lenB) {
            if (lcb.substring((lenB - lenA), lenB).equals(lca)) {
                return true;
            }
        }
        if (lenA == lenB && lca.equals(lcb)) {
            return true;
        }
        return false;

    }
    
    /**
     * My solution using substring and equalsIgnoreCase rather than
     * toLowerCase
     * @param a
     * @param b
     * @return 
     */
    public static boolean endOther2(String a, String b) {
        // no need to create new variables for a and b
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() > b.length()) {
//            return a.substring((a.length()-b.length())).equalsIgnoreCase(b);
            return a.substring((a.length()-b.length())).equals(b.toLowerCase());
        } else {
//            return b.substring((b.length()-a.length())).equalsIgnoreCase(a);
            return b.substring((b.length()-a.length())).equals(a.toLowerCase());
        }
    }

}
