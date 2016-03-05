package logic1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-05.
 */
public class TeaParty {
    public static void main(String[] args) {
        System.out.println(teaParty(3,8));
    }

    public static int teaParty(int a, int b) {
        int d1 = 2 * a;
        int d2 = 2 * b;
        if (a >= 5 && b >= 5) {
            if (a >= d2 || b >= d1) {
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
