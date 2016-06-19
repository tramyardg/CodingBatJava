package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MakeBricks {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) {
            return false;
        } else if (goal % 5 > small) {
            return false;
        }
        return true;
    }

}
