package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class NoTeenSum {
    public static void main(String[] args) {
        System.out.println(fixTeen(16));
        System.out.println(noTeenSum(2,1,14));
    }
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    
    public static int fixTeen(int n) {
        if(n >= 13 && n <= 19) {
            int modTeen = n%5;
            if(modTeen > 1) {
                return 0;
            } 
        }
        return n;
    }

}
