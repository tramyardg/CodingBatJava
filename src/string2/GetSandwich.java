package string2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class GetSandwich {

    public static void main(String[] args) {
        String str = "xxbreadyy";
        System.out.println(getSandwich(str));
    }

    public static String getSandwich(String str) {
        String newStr = "";
        int indexOfb = str.indexOf("b");
        int lastIndexOfb = str.lastIndexOf("b");
        int indexOfd = str.indexOf("d");
        int lastIndexOfd = str.lastIndexOf("d");
        
        if (Math.abs(lastIndexOfd - indexOfb) != 0 && Math.abs(lastIndexOfd - indexOfd) != 0) {
            newStr = str.substring(indexOfd+1, lastIndexOfb);
        }
        return newStr;
    }

}
