package warmup1;

/**
 * Created by RAYMART on 2016-02-12.
 */
public class BackAround {
    public static void main (String[] args) {
        System.out.println("given a string cat --> " + backAround("cat"));
    }

    /*
    given a string, take the last char and return a new string with the last
    char added at the front and the back, the string cannot be less than 1
    char
    e.g.
        cat --> tcatt

     */

    public static String backAround(String newStr){
        char result = newStr.charAt(newStr.length()-1);
        String addedStr = result+newStr+result;
        return addedStr;
    }

}
