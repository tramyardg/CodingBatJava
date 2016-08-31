package string2;

public class BobThree {

    public static void main(String[] args) {
        String str = "b";
        System.out.println(bobThere(str));
    }

    public static boolean bobThere(String str) {
        /*
        if (str.length() < 3) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("b") && i <= str.length() - 3) {
                if (str.substring(i + 2, i + 3).equals("b")) {
                    return true;
                }
            }
        }
        */
        
        // solution using charAt (this is shorter, less complicated than using substring)
        // Gregor Ulm solution
        if(str.length() >= 3) {
            for(int i = 0; i < str.length()-2; i++) {
                if(str.charAt(i)=='b' && str.charAt(i+2)=='b') {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    

}
