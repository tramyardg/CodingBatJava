package warmup1;

/**
 * Created by RAYMART on 2016-02-14.
 */
class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(10, 0));
    }

    public static boolean lastDigit(int a, int b) {
        int c;
        int d;
        if (a >= 10) {
            c = a % 10;
            if (b < 10) {
                if (c == b) {
                    return true;
                }
            }
        }
        if (b >= 10) {
            c = b % 10;
            if (a < 10) {
                if (c == a) {
                    return true;
                }
            }
        }
        if ((a >= 10 && b >= 10) || (a == b)) {
            c = a % 10;
            d = b % 10;
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    // There is also the very short version of this
    // return (a % 10 == b % 10)
    // that's it

}
