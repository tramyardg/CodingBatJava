package string2;

public class DoubleChar {

    public static void main(String[] args) {
        String str = "Hi-There";
        // HHii--TThheerree
//        System.out.println(doubleChar(str));
        // HHii--TThheerree
        System.out.println(doubleChar2(str));
    }

    public static String doubleChar(String str) {
        int strLen = str.length();
        String newStr = "";
        for (int i = 0; i < strLen; i++) {
            newStr += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return newStr;
    }
    
    public static String doubleChar2(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
        }
        return newStr;
    }
}
