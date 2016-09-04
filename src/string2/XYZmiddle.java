package string2;

public class XYZmiddle {

    public static void main(String[] args) {

        String str = "xyzxyzAxyzBxyzxyz";

        System.out.println(xyzMiddle(str));
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        String xyz = "xyz";
        int len = str.length();
        int middle = len / 2;

        if (len % 2 != 0) {
            return xyz.equals(str.substring(middle - 1, middle + 2));
        } else if (xyz.equals(str.substring(middle - 1, middle + 2))
                || xyz.equals(str.substring(middle - 2, middle + 1))) {
            return true;
        }

        return false;
    }

}
